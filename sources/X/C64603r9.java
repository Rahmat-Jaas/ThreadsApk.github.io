package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.3r9  reason: invalid class name and case insensitive filesystem */
public final class C64603r9 implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public C64603r9(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        String A0V;
        int A05 = C14030oh.A05(-1856024572);
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            Context context = view2.getContext();
            for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.A03, new Class[]{View.class})) != null) {
                        this.A01 = method;
                        this.A00 = context2;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0V = "";
            } else {
                A0V = AnonymousClass00U.A0V(" with id '", context.getResources().getResourceEntryName(id), "'");
            }
            StringBuilder A0s = C18190wL.A0s("Could not find method ");
            A0s.append(this.A03);
            A0s.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A0s.append(view2.getClass());
            throw C18180wK.A0a(C18180wK.A0i(A0V, A0s));
        }
        try {
            method.invoke(this.A00, new Object[]{view});
            C14030oh.A0C(-677595971, A05);
        } catch (IllegalAccessException e) {
            illegalStateException = new IllegalStateException("Could not execute non-public method for android:onClick", e);
            i = 318258167;
            C14030oh.A0C(i, A05);
            throw illegalStateException;
        } catch (InvocationTargetException e2) {
            illegalStateException = new IllegalStateException("Could not execute method for android:onClick", e2);
            i = -1849108503;
            C14030oh.A0C(i, A05);
            throw illegalStateException;
        }
    }
}
