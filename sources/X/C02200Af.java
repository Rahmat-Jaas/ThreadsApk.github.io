package X;

import android.content.Context;
import com.facebook.analytics2.logger.DefaultHandlerThreadFactory;
import com.facebook.analytics2.logger.HandlerThreadFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.0Af  reason: invalid class name and case insensitive filesystem */
public final class C02200Af {
    public static C02200Af A08;
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final Context A06;
    public final ArrayList A07 = new ArrayList();

    public static synchronized Object A01(C02200Af r4, String str, ArrayList arrayList) {
        Object obj;
        synchronized (r4) {
            try {
                obj = r4.A03(Class.forName(str), arrayList);
            } catch (ClassNotFoundException e) {
                AnonymousClass0LU.A0K("ContextConstructorHelper", "Cannot find class: %s", e, str);
                obj = null;
            }
        }
        return obj;
    }

    public static synchronized Object A02(C02200Af r4, String str, ArrayList arrayList) {
        Object obj;
        synchronized (r4) {
            try {
                obj = r4.A03(Class.forName(str), arrayList);
            } catch (ClassNotFoundException e) {
                AnonymousClass0LU.A0K("ContextConstructorHelper", "Cannot find class: %s", e, str);
            } catch (IllegalAccessException e2) {
                AnonymousClass0LU.A0J("ContextConstructorHelper", "IllegalAccessException", e2);
            } catch (InstantiationException e3) {
                AnonymousClass0LU.A0J("ContextConstructorHelper", "InstantiationException", e3);
            } catch (NoSuchMethodException e4) {
                AnonymousClass0LU.A0J("ContextConstructorHelper", "NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                AnonymousClass0LU.A0J("ContextConstructorHelper", "InvocationTargetException", e5);
            }
        }
        return obj;
        obj = null;
        return obj;
    }

    private synchronized Object A03(Class cls, ArrayList arrayList) {
        Object newInstance;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.A06});
                arrayList.add(newInstance);
                break;
            }
            newInstance = arrayList.get(i);
            if (newInstance.getClass().equals(cls)) {
                break;
            }
            i++;
        }
        return newInstance;
    }

    public static synchronized C02200Af A00(Context context) {
        C02200Af r1;
        synchronized (C02200Af.class) {
            r1 = A08;
            if (r1 == null) {
                r1 = new C02200Af(context.getApplicationContext());
                A08 = r1;
            }
        }
        return r1;
    }

    public final HandlerThreadFactory A04(String str) {
        HandlerThreadFactory handlerThreadFactory = (HandlerThreadFactory) A02(this, str, this.A07);
        if (handlerThreadFactory != null) {
            return handlerThreadFactory;
        }
        DefaultHandlerThreadFactory defaultHandlerThreadFactory = new DefaultHandlerThreadFactory(this.A06);
        AnonymousClass0LU.A0D("ContextConstructorHelper", "Unable to create instance for HandlerThreadFactory");
        return defaultHandlerThreadFactory;
    }

    public C02200Af(Context context) {
        this.A06 = context;
    }
}
