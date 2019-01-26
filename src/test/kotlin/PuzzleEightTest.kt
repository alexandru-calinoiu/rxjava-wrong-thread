import org.junit.jupiter.api.Test

internal class PuzzleEightTest {
    @Test
    fun `call will work`() {
        /*
        A. main thread name: main
           subscribe onNext 1: RxNewThreadScheduler
           subscribe onNext 2: RxNewThreadScheduler
           subscribe onNext 3: RxNewThreadScheduler

        B. main thread name: main
           subscribe onNext 1: RxNewThreadScheduler
           subscribe onNext 2: RxNewThreadScheduler
           subscribe onNext 3: main

        C. main thread name: main
           subscribe onNext 1: RxNewThreadScheduler
           subscribe onNext 2: RxIoScheduler
           subscribe onNext 3: main

        D. All the above

        E. None of the above
         */
        PuzzleEight().call()
    }
}