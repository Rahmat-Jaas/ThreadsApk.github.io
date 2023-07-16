package com.google.firebase.iid;

import X.AnonymousClass75a;
import X.AnonymousClass78C;
import X.AnonymousClass79T;
import X.AnonymousClass7o9;
import X.AnonymousClass7oA;
import X.AnonymousClass7oF;
import X.C105146cx;
import X.C113906sM;
import X.C117096y7;
import X.C121787Id;
import X.C18180wK;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C113906sM r2 = new C113906sM(cls, new Class[0]);
        AnonymousClass79T.A00(r2, C121787Id.class, 1);
        AnonymousClass79T.A00(r2, AnonymousClass7oF.class, 1);
        AnonymousClass79T.A00(r2, AnonymousClass75a.class, 1);
        r2.A02 = AnonymousClass7oA.A00;
        if (C18180wK.A1W(r2.A00)) {
            r2.A00 = 1;
            AnonymousClass78C A00 = r2.A00();
            C113906sM r1 = new C113906sM(C105146cx.class, new Class[0]);
            AnonymousClass79T.A00(r1, cls, 1);
            r1.A02 = AnonymousClass7o9.A00;
            return Arrays.asList(new AnonymousClass78C[]{A00, r1.A00(), C117096y7.A01("fire-iid", "18.0.0")});
        }
        throw C18180wK.A0a("Instantiation type has already been set.");
    }
}
