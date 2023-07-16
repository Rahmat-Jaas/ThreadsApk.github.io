package com.google.vr.dynamite.client;

import X.C14030oh;
import X.C18190wL;
import android.os.IBinder;
import java.lang.reflect.Field;

public final class ObjectWrapper extends c {
    public final Object wrappedObject;

    public static Object unwrap(IObjectWrapper iObjectWrapper, Class cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                Field field3 = field;
                field = field2;
                if (field3 != null) {
                    field = null;
                    break;
                }
            }
            i++;
        }
        if (field == null) {
            throw C18190wL.A0a("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw C18190wL.A0a("remoteBinder is the wrong class.");
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw C18190wL.A0a("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public ObjectWrapper(Object obj) {
        int A03 = C14030oh.A03(652179987);
        this.wrappedObject = obj;
        C14030oh.A0A(496130142, A03);
    }
}
