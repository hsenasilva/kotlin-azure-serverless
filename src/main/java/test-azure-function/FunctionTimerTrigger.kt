package `test-azure-function`

import com.microsoft.azure.functions.ExecutionContext
import com.microsoft.azure.functions.annotation.FunctionName
import com.microsoft.azure.functions.annotation.TimerTrigger

class FunctionTimerTrigger {

    @FunctionName("keepAlive")
    fun keepAlive(
            @TimerTrigger(name = "keepAliveTrigger", schedule = "1 * * * * *") timerInfo: String,
            context: ExecutionContext
    ): String {
        // timeInfo is a JSON string, you can deserialize it to an object using your favorite JSON library
        context.logger.info("Timer is triggered: $timerInfo")
        println("Timer is triggered: $timerInfo")

        return "From timer: \"" + timerInfo + "\"";
    }

}