package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.1mU  reason: invalid class name */
public final class AnonymousClass1mU extends AnonymousClass0gG {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mU(String str, String str2) {
        super(135, 4, false, false);
        this.A01 = str;
        this.A00 = str2;
    }

    public final void run() {
        try {
            AnonymousClass0hL.A09(new File(this.A00), new FileInputStream(this.A01));
        } catch (IOException e) {
            C10450iM.A06("failed to cache gif file", AnonymousClass00U.A0d("from: ", this.A01, " to: ", this.A00), e);
        }
    }
}
