import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PuzzleFourTest {
    @Test
    fun `call will do the work`() {
        /*
        A. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler

        B. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler
           subscribe onNext: main

        C. None of the above
         */
        PuzzleFour().call()
    }
}