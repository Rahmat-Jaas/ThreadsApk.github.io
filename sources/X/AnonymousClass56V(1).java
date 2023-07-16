package X;

import android.app.Application;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsImportDraftRepository;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3;
import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;

/* renamed from: X.56V  reason: invalid class name */
public final class AnonymousClass56V extends AnonymousClass10X {
    public long A00;
    public final M5J A01;
    public final M5J A02;
    public final ClipsDraftPreviewItemRepository A03;
    public final ClipsImportDraftRepository A04;
    public final EFO A05;
    public final C28161tl A06;
    public final UserSession A07;
    public final C86064wD A08;
    public final C84714tk A09;
    public final C84714tk A0A;
    public final C84714tk A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56V(Application application, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, ClipsImportDraftRepository clipsImportDraftRepository, EFO efo, C28161tl r11, UserSession userSession) {
        super(application);
        C18190wL.A1S(r11, 3, clipsDraftPreviewItemRepository);
        this.A07 = userSession;
        this.A06 = r11;
        this.A05 = efo;
        this.A03 = clipsDraftPreviewItemRepository;
        this.A04 = clipsImportDraftRepository;
        C27442EnY enY = new C27442EnY();
        this.A08 = enY;
        this.A0A = AnonymousClass7C4.A02(enY);
        IDxFlowShape251S0100000_2_I2 iDxFlowShape251S0100000_2_I2 = new IDxFlowShape251S0100000_2_I2(clipsDraftPreviewItemRepository.A04, 15);
        this.A09 = iDxFlowShape251S0100000_2_I2;
        IDxFlowShape251S0100000_2_I2 iDxFlowShape251S0100000_2_I22 = new IDxFlowShape251S0100000_2_I2(clipsImportDraftRepository.A0A, 16);
        this.A0B = iDxFlowShape251S0100000_2_I22;
        Object[] array = AnonymousClass00J.A0N(C06750aI.A17(iDxFlowShape251S0100000_2_I22, iDxFlowShape251S0100000_2_I2)).toArray(new C84714tk[0]);
        if (array != null) {
            this.A01 = C29110FiC.A00((C27952Ew2) null, new IDxFlowShape250S0100000_1_I2(array, 2), 3);
            this.A02 = C29110FiC.A00((C27952Ew2) null, iDxFlowShape251S0100000_2_I2, 3);
            return;
        }
        throw C18210wN.A0W(C18170wI.A00(8));
    }

    public final void A09() {
        Iterable iterable = (Iterable) this.A01.A08();
        if (iterable != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : iterable) {
                if (((CKW) next).A00()) {
                    A0v.add(next);
                }
            }
            ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                A0w.add(((CKW) it.next()).A07);
            }
            UserSession userSession = this.A07;
            C25831Dsp A022 = C25567Do3.A02(userSession);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022.A0W, "ig_camera_see_all_drafts"), 1024);
            if (AnonymousClass0wJ.A1U(A0I)) {
                AnonymousClass6BO.A01(A0I, A022, A0w);
                A0I.A0O(A022.A06, "entry_point");
                C18190wL.A1L(A0I);
                A0I.A0O(A022.A0B, "surface");
                A0I.Bb4();
            }
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A03;
            KtLambdaShape168S0100000_I2_1 ktLambdaShape168S0100000_I2_1 = new KtLambdaShape168S0100000_I2_1(this, 27);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape10S0301000_I2_2((C146958n9) null, (Object) ktLambdaShape168S0100000_I2_1, (Object) clipsDraftPreviewItemRepository, 18), AnonymousClass7Ja.A03(clipsDraftPreviewItemRepository.A02), 3);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36325961511413092L)) {
                C25237DiI.A00((Integer) null, C25295DjG.A01, new KtSLambdaShape13S0100000_I2_2(this, (C146958n9) null, 12), AnonymousClass3J5.A00(this), 2);
            }
        }
    }

    public static final long A00(AnonymousClass56V r7, File file) {
        File[] listFiles = file.listFiles();
        if (!file.isDirectory() || listFiles == null) {
            return file.length();
        }
        long j = 0;
        for (File file2 : listFiles) {
            C04220Ms.A03(file2);
            j += A00(r7, file2);
        }
        return j;
    }

    public final void A0A(CKW ckw) {
        A0B(C06750aI.A14(ckw));
    }

    public final void A0B(List list) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape17S0201000_I2_3(this, list, (C146958n9) null, 29), AnonymousClass3J5.A00(this), 3);
    }
}
