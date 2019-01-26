import org.junit.jupiter.api.Test

internal class PuzzleOneTest {
    @Test
    fun `call will do the funk`() {
        /*
        A*. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: main

        B. main thread name: main
           subscribe onNext: RxComputationScheduler
           subscribe onNext: RxComputationScheduler

        C. main thread name: main
           subscribe onNext: main
           subscribe onNext: main

        D. None of the above
         */
        val puzzelOne = PuzzleOne()
        puzzelOne.call()
    }
}