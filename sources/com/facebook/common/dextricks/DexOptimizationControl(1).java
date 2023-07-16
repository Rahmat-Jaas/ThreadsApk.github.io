package com.facebook.common.dextricks;

import X.C16420t2;
import android.content.Context;
import android.content.Intent;

public class DexOptimizationControl {
    public static void pauseOptimization(Context context, int i) {
        Intent intent = new Intent(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
        intent.putExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, System.nanoTime() + ((long) (i * DexStore.MS_IN_NS)));
        C16420t2.A00().A07().A05(context, intent);
    }
}
