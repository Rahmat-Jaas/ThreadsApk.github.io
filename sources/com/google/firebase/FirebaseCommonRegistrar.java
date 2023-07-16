package com.google.firebase;

import X.AnonymousClass0wJ;
import X.AnonymousClass6JJ;
import X.AnonymousClass75a;
import X.AnonymousClass76E;
import X.AnonymousClass79T;
import X.AnonymousClass7o8;
import X.AnonymousClass7oB;
import X.AnonymousClass7oO;
import X.AnonymousClass7oP;
import X.AnonymousClass7oQ;
import X.AnonymousClass7oR;
import X.AnonymousClass8eX;
import X.C113906sM;
import X.C117096y7;
import X.C134807yP;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public final List getComponents() {
        String str;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C113906sM r3 = new C113906sM(AnonymousClass75a.class, new Class[0]);
        AnonymousClass79T.A00(r3, AnonymousClass6JJ.class, 2);
        r3.A02 = AnonymousClass7oB.A00;
        A0v.add(r3.A00());
        C113906sM r32 = new C113906sM(AnonymousClass76E.class, new Class[0]);
        AnonymousClass79T.A00(r32, Context.class, 1);
        AnonymousClass79T.A00(r32, AnonymousClass8eX.class, 2);
        r32.A02 = AnonymousClass7o8.A00;
        A0v.add(r32.A00());
        A0v.add(C117096y7.A01("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        A0v.add(C117096y7.A01("fire-core", "19.5.0"));
        A0v.add(C117096y7.A01("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        A0v.add(C117096y7.A01("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        A0v.add(C117096y7.A01("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        A0v.add(C117096y7.A00(AnonymousClass7oO.A00, "android-target-sdk"));
        A0v.add(C117096y7.A00(AnonymousClass7oP.A00, "android-min-sdk"));
        A0v.add(C117096y7.A00(AnonymousClass7oQ.A00, "android-platform"));
        A0v.add(C117096y7.A00(AnonymousClass7oR.A00, "android-installer"));
        try {
            str = C134807yP.A01.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            A0v.add(C117096y7.A01("kotlin", str));
        }
        return A0v;
    }
}
