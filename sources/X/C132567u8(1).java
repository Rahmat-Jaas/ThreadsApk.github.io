package X;

import java.io.IOException;

/* renamed from: X.7u8  reason: invalid class name and case insensitive filesystem */
public abstract class C132567u8 implements C144618in {
    public abstract C146578mT A00(MMo mMo);

    /* renamed from: A01 */
    public final C146578mT then(GJX gjx) {
        MMo mMo = null;
        C148738rm A00 = gjx.A00();
        if (A00 != null) {
            try {
                mMo = C18987Aon.A00.A07(A00.AUn());
                if (C86144wL.A0S(mMo) == null) {
                    throw C86154wM.A0V("Response body is empty");
                }
            } catch (Throwable th) {
                if (mMo != null) {
                    try {
                        mMo.close();
                    } catch (IOException unused) {
                    }
                }
                if (A00 != null) {
                    A00.ADV();
                }
                throw th;
            }
        }
        C146578mT A002 = A00(mMo);
        A002.setStatusCode(gjx.A02);
        if (mMo != null) {
            try {
                mMo.close();
            } catch (IOException unused2) {
            }
        }
        if (A00 != null) {
            A00.ADV();
        }
        return A002;
    }
}
