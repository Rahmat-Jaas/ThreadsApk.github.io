package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface IGmsCallbacks extends IInterface {
    void CBo(int i, IBinder iBinder, Bundle bundle);
}
