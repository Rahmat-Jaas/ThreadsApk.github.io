package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.util.Log;

public class DalvikReplaceBuffer {
    public static final String LOG_TAG = "DalvikReplaceBuffer";
    public static String failureReason = "";
    public static Result resultValue = Result.NOT_ATTEMPTED;

    public enum Result {
        NOT_ATTEMPTED,
        FAILURE,
        SUCCESS
    }

    public static String getFailureString() {
        if (resultValue == Result.FAILURE) {
            return failureReason;
        }
        throw new IllegalStateException("No failure string is provided when the operation did not fail.");
    }

    public static void replaceBuffer(DalvikLinearAllocType dalvikLinearAllocType) {
        if (resultValue != Result.NOT_ATTEMPTED) {
            Log.e(LOG_TAG, "Multiple attempts to replace the buffer detected!");
            return;
        }
        try {
            DalvikInternals.fixLinearAllocBuffer(dalvikLinearAllocType.bufferSizeBytes);
            resultValue = Result.SUCCESS;
        } catch (Throwable th) {
            resultValue = Result.FAILURE;
            failureReason = th.getMessage();
            Log.e(LOG_TAG, AnonymousClass00U.A0S("Failed to replace LinearAlloc buffer (at size ", "). Continuing with standard buffer.", dalvikLinearAllocType.bufferSizeBytes), th);
        }
    }

    public static Result getResult() {
        return resultValue;
    }

    public static boolean replaceBufferIfNecessary(DalvikLinearAllocType dalvikLinearAllocType) {
        return false;
    }
}
