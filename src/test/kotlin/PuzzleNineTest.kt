import org.junit.jupiter.api.Test

internal class PuzzleNineTest {
    @Test
    fun `call will work`() {
        /*
        A. main thread name: main
           subscribe onNext 1: main
           subscribe onNext 2: main

        B. main thread name: main
           subscribe onNext 1: RxIoScheduler
           subscribe onNext 2: RxIoScheduler

        C*. main thread name: main
           subscribe onNext 1: RxIoScheduler
           subscribe onNext 2: main

        D. None of the above
         */
        PuzzleNine().call()
    }
}