package X;

import com.instagram.api.schemas.CallToAction;
import com.instagram.api.schemas.Destination;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.57b  reason: invalid class name and case insensitive filesystem */
public final class C881857b extends C62793ak {
    public final M5J A00;
    public final CallToAction A01;
    public final Destination A02;
    public final C37741K2b A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final C86064wD A08;
    public final C84714tk A09;
    public final C86074wE A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final AnonymousClass6PJ A0D;

    public C881857b(CallToAction callToAction, Destination destination, C37741K2b k2b, AnonymousClass6PJ r14, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        AnonymousClass69A[] r1;
        List A17;
        AnonymousClass69A r0;
        this.A04 = userSession;
        this.A05 = str;
        this.A02 = destination;
        this.A06 = str2;
        this.A01 = callToAction;
        this.A0C = z;
        this.A0B = z2;
        this.A03 = k2b;
        this.A0D = r14;
        C27444Ena ena = new C27444Ena(AnonymousClass006.A00, AnonymousClass743.A00);
        this.A08 = ena;
        this.A09 = AnonymousClass7C4.A02(ena);
        C27457Enn A0z = C18190wL.A0z(false);
        this.A0A = A0z;
        this.A00 = C29110FiC.A00((C27952Ew2) null, A0z, 3);
        int ordinal = destination.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                r1 = new AnonymousClass69A[]{AnonymousClass69A.A05, AnonymousClass69A.A08, AnonymousClass69A.A06, AnonymousClass69A.A09};
            } else if (ordinal == 2) {
                r1 = new AnonymousClass69A[3];
                r1[0] = AnonymousClass69A.A05;
                r0 = AnonymousClass69A.A07;
                r1[1] = r0;
                r1[2] = AnonymousClass69A.A09;
            } else if (ordinal != 4) {
                A17 = AnonymousClass0ZV.A00;
            } else {
                r1 = new AnonymousClass69A[]{AnonymousClass69A.A05, AnonymousClass69A.A08};
            }
            A17 = C06750aI.A17(r1);
        } else {
            r1 = new AnonymousClass69A[3];
            r1[0] = AnonymousClass69A.A05;
            r0 = AnonymousClass69A.A08;
            r1[1] = r0;
            r1[2] = AnonymousClass69A.A09;
            A17 = C06750aI.A17(r1);
        }
        this.A07 = A17;
    }
}
