package com.google.android.gms.dynamic;

import X.C13320nQ;
import X.C14030oh;
import X.C18190wL;
import X.C86104wH;
import X.C86114wI;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

public final class ObjectWrapper extends IObjectWrapper.Stub {
    public final Object A00;

    public static Object A01(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C13320nQ.A01(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw C18190wL.A0a("IObjectWrapper declared field not private!");
            }
        } else {
            throw C18190wL.A0a(C86104wH.A10("Unexpected number of IObjectWrapper declared fields: ", C86114wI.A0s(64), r5));
        }
    }

    public ObjectWrapper(Object obj) {
        int A03 = C14030oh.A03(-212057726);
        this.A00 = obj;
        C14030oh.A0A(-1921809681, A03);
    }
}
