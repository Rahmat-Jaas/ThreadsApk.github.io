package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.3NM  reason: invalid class name */
public final class AnonymousClass3NM {
    public static final CMN A00(C85834vq r1) {
        CMN cmn;
        if (r1 instanceof CMN) {
            cmn = (CMN) r1;
        } else {
            if (r1 instanceof C23168CnC) {
                cmn = ((C23168CnC) r1).A00;
            }
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected DirectThreadId: ", r1));
        }
        if (cmn != null) {
            return cmn;
        }
        throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected DirectThreadId: ", r1));
    }

    public static final MsysThreadId A01(C85834vq r1) {
        MsysThreadId msysThreadId;
        if (r1 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) r1;
        } else {
            if (r1 instanceof C23168CnC) {
                msysThreadId = ((C23168CnC) r1).A01;
            }
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected MsysThreadId: ", r1));
        }
        if (msysThreadId != null) {
            return msysThreadId;
        }
        throw C18180wK.A0a(AnonymousClass0wJ.A0t("Expected MsysThreadId: ", r1));
    }
}
