@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello, World"
    }

    @RequestMapping("/something")
    String nextLink() {
        return "This is a second extension"
    }

}