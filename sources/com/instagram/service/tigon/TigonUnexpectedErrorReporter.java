package com.instagram.service.tigon;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C10300i6;
import X.C10770iu;
import X.C14090on;
import X.C14100oo;

public final class TigonUnexpectedErrorReporter {
    public final C14090on A00;
    public final C10300i6 A01;

    public TigonUnexpectedErrorReporter(C10300i6 r2) {
        C04220Ms.A0B(r2, 1);
        this.A01 = r2;
        C14090on A002 = C10770iu.A00();
        C04220Ms.A06(A002);
        this.A00 = A002;
    }

    public final void report(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        C14100oo ABJ = this.A00.ABJ(str, 817903658);
        ABJ.A8U("error_message", str2);
        ABJ.report();
    }
}
