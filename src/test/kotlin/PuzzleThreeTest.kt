import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PuzzleThreeTest {
    @Test
    fun `will do the work`() {
        /*
        A. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxIoScheduler

        B. main thread name: main
           subscribe onNext: main
           subscribe onNext: main

        C. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler

        D. main thread name: main
           subscribe onNext: RxIoScheduler
           subscribe onNext: RxIoScheduler

        E. None of the above
         */
        PuzzleThree().call()
    }
}