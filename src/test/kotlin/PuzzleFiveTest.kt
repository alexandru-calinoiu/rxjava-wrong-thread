import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PuzzleFiveTest {
    @Test
    fun `call will work`() {
        /*
        A. main thread name: main
           subscribe onNext: RxIoScheduler

        B+. main thread name: main
           subscribe onNext: RxComputationScheduler

        C*. None of the above
         */
        PuzzleFive().call()
    }
}