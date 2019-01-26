import org.junit.jupiter.api.Test

class PuzzleTwoTest {
    @Test
    fun `call will do something`() {
        /*
        A*. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxIoScheduler

        B. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: main

        C. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler

        D. None of the above
         */
        PuzzleTwo().call()
    }
}