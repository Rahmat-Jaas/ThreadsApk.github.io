package X;

import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.IDxFReferenceShape178S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;

/* renamed from: X.10i  reason: invalid class name and case insensitive filesystem */
public final class C195610i extends C62793ak implements C0Q {
    public boolean A00;
    public final AnonymousClass495 A01;
    public final SubscribedAndRecommendedCreatorListRepository A02;
    public final C106376ew A03;
    public final UserSession A04;
    public final String A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final boolean A09;

    public static final AnonymousClass198 A00(C195610i r8, User user, boolean z) {
        Integer num;
        C170019uI r4;
        if (z) {
            num = AnonymousClass006.A0C;
        } else {
            num = AnonymousClass006.A0Y;
        }
        Integer num2 = AnonymousClass006.A0N;
        User user2 = user;
        C57943Dd A002 = AnonymousClass2O8.A00(r8.A04, user);
        if (user.A02 == C307022o.SUBSCRIBED) {
            r4 = C170019uI.SECONDARY;
        } else {
            r4 = C170019uI.PRIMARY;
        }
        return new AnonymousClass198(A002, (C57943Dd) null, r4, user2, num2, num, 1760, false, true);
    }

    public final boolean BO8() {
        Collection collection;
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A02;
        Collection collection2 = (Collection) subscribedAndRecommendedCreatorListRepository.A0F.getValue();
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) subscribedAndRecommendedCreatorListRepository.A0E.getValue()) == null || collection.isEmpty()) && !C18190wL.A1a((Collection) subscribedAndRecommendedCreatorListRepository.A0G.getValue()))) {
            return false;
        }
        return true;
    }

    public final boolean BOI() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A02;
        if (subscribedAndRecommendedCreatorListRepository.A05 || subscribedAndRecommendedCreatorListRepository.A04) {
            return true;
        }
        return false;
    }

    public final boolean BTo() {
        return AnonymousClass0wJ.A1X(this.A02.A0H.getValue());
    }

    public final boolean BVc() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A02;
        if (subscribedAndRecommendedCreatorListRepository.A05 || subscribedAndRecommendedCreatorListRepository.A04) {
            return true;
        }
        return false;
    }

    public final boolean BVe() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A02;
        return C06750aI.A17(subscribedAndRecommendedCreatorListRepository.A01, subscribedAndRecommendedCreatorListRepository.A00).contains(AnonymousClass22N.IN_PROGRESS);
    }

    public /* synthetic */ C195610i(SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, UserSession userSession, String str, boolean z) {
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
        C106376ew A003 = AnonymousClass2SP.A00(userSession);
        C18230wP.A1R(A002, 5, A003);
        this.A04 = userSession;
        this.A02 = subscribedAndRecommendedCreatorListRepository;
        this.A09 = z;
        this.A05 = str;
        this.A01 = A002;
        this.A03 = A003;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass1pN.A00);
        this.A06 = A0z;
        this.A08 = A0z;
        C84714tk A012 = AnonymousClass3XM.A01(C25807DsL.A02(new IDxFReferenceShape178S0000000_1_I2(this, 0), subscribedAndRecommendedCreatorListRepository.A0F, subscribedAndRecommendedCreatorListRepository.A0E, subscribedAndRecommendedCreatorListRepository.A0G));
        C86094wG A042 = C25753DrP.A04(AnonymousClass0ZV.A00, AnonymousClass3J5.A00(this), A012, AnonymousClass74I.A01);
        this.A07 = A042;
        KtLambdaShape158S0100000_I2_13 ktLambdaShape158S0100000_I2_13 = new KtLambdaShape158S0100000_I2_13(this, 45);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(ktLambdaShape158S0100000_I2_13, A042, (C146958n9) null, 1), AnonymousClass3J5.A00(this), 3);
    }

    public static final List A01(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            User user = (User) next;
            C84624tY A0I = user.A0I();
            if (!(A0I == null || A0I.AhE() == null || user.A02 == C307022o.NO_SUBSCRIPTION)) {
                A0v.add(next);
            }
        }
        return A0v;
    }

    public final void Bas() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 22), AnonymousClass3J5.A00(this), 3);
    }
}
