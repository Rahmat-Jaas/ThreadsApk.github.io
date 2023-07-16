package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.archive.data.ArchiveStoryRecycleBinRepository;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.581  reason: invalid class name */
public final class AnonymousClass581 extends C62793ak {
    public final ArchiveStoryRecycleBinRepository A00;
    public final C11630kW A01 = new AnonymousClass7po(this);
    public final UserSession A02;
    public final C86074wE A03;
    public final C86094wG A04;
    public final C86094wG A05;

    public /* synthetic */ AnonymousClass581(UserSession userSession) {
        ArchiveStoryRecycleBinRepository archiveStoryRecycleBinRepository = new ArchiveStoryRecycleBinRepository(userSession);
        this.A02 = userSession;
        this.A00 = archiveStoryRecycleBinRepository;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0200000_I2((Integer) null, (Map) null, (DefaultConstructorMarker) null, 3, 18));
        this.A03 = A0z;
        this.A04 = C18230wP.A0x((C148838sG) null, A0z);
        IDxFlowShape94S0200000_2_I2 iDxFlowShape94S0200000_2_I2 = new IDxFlowShape94S0200000_2_I2(12, (Object) archiveStoryRecycleBinRepository.A07, (Object) this);
        this.A05 = C25753DrP.A04(new KtCSuperShape0S1200000_I2((Integer) null, (List) null, 7), AnonymousClass3J5.A00(this), iDxFlowShape94S0200000_2_I2, AnonymousClass74I.A01);
    }

    public final void onCleared() {
        this.A00.onUserSessionWillEnd(false);
    }

    public static final List A00(UserSession userSession, Map map) {
        List list;
        Collection<AnonymousClass79P> values = map.values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass79P r0 : values) {
            C22179CKt cKt = (C22179CKt) r0.A00;
            Reel reel = (Reel) r0.A01;
            if (reel.A0r(userSession)) {
                list = AnonymousClass0ZV.A00;
            } else if (!reel.A0s(userSession)) {
                List A0P = reel.A0P(userSession);
                C04220Ms.A06(A0P);
                ArrayList A0x = AnonymousClass0wJ.A0x(A0P, 10);
                int i = 0;
                for (Object next : A0P) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    BKH bkh = (BKH) next;
                    C04220Ms.A04(bkh);
                    A0x.add(new AnonymousClass5vC(reel, bkh, i, cKt.A01));
                    i = i2;
                }
                List A0s = C18200wM.A0s(A0x);
                Iterator A0t = C86134wK.A0t(reel.A1A);
                while (A0t.hasNext()) {
                    Number number = (Number) A0t.next();
                    C04220Ms.A04(number);
                    A0s.add(new AnonymousClass5vE(reel, number.intValue(), cKt.A01));
                }
                list = A0s;
            } else {
                AnonymousClass8bH A0C = AnonymousClass8bI.A0C(0, cKt.A00);
                ArrayList A0x2 = AnonymousClass0wJ.A0x(A0C, 10);
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    A0x2.add(new AnonymousClass5vD(reel, ((C1367083z) it).A00(), cKt.A01));
                }
                list = A0x2;
            }
            C000300e.A0r(list, A0v);
        }
        return A0v;
    }

    public final void A01(boolean z) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) this, (C146958n9) null, 2, z), AnonymousClass3J5.A00(this), 3);
    }
}
