import org.junit.jupiter.api.Test

internal class PuzzleSixTest {
    @Test
    fun `call with work`() {
        /*
        A. main thread name: main
           subscribe onNext: RxIoScheduler

        B. main thread name: main
           subscribe onNext: RxComputationScheduler

        C. Either of the above

        D. None of the above
         */
        PuzzleSix().call()
    }
}