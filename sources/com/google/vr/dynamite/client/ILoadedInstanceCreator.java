package com.google.vr.dynamite.client;

import android.os.IInterface;

public interface ILoadedInstanceCreator extends IInterface {
    INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);
}
