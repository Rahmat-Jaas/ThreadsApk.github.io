package kotlin.coroutines.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass4VZ;
import X.AnonymousClass667;
import X.C146958n9;
import X.C39142Kno;
import X.C62903b6;
import X.C86074wE;
import X.C86164wN;
import X.C882757k;
import X.C970867w;
import X.D0E;
import com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource;
import com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository;
import com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.user.model.User;
import kotlin.Unit;

public class KtSLambdaShape3S1101000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape3S1101000_I2(Object obj, String str, C146958n9 r4, int i) {
        super(1, r4);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final C146958n9 create(C146958n9 r5) {
        int i;
        int i2 = this.A03;
        Object obj = this.A01;
        String str = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new KtSLambdaShape3S1101000_I2(obj, str, r5, i);
    }

    public final Object invokeSuspend(Object obj) {
        C86074wE r1;
        C970867w r0;
        switch (this.A03) {
            case 0:
                D0E d0e = D0E.COROUTINE_SUSPENDED;
                if (this.A00 != 0) {
                    AnonymousClass0OU.A00(obj);
                } else {
                    AnonymousClass0OU.A00(obj);
                    FollowingGraphRepository followingGraphRepository = ((C882757k) this.A01).A00;
                    String str = this.A02;
                    this.A00 = 1;
                    obj = followingGraphRepository.A02(str, this);
                    if (obj == d0e) {
                        return d0e;
                    }
                }
                if (obj instanceof AnonymousClass1jB) {
                    r1 = ((C882757k) this.A01).A0B;
                    r0 = C970867w.Error;
                } else if (obj instanceof AnonymousClass1jA) {
                    C882757k r2 = (C882757k) this.A01;
                    User user = (User) r2.A0E.getValue();
                    if (user != null) {
                        user.A1u(r2.A03);
                    }
                    r1 = r2.A0B;
                    r0 = C970867w.Success;
                }
                r1.CrC(r0);
                break;
            case 1:
                D0E d0e2 = D0E.COROUTINE_SUSPENDED;
                if (this.A00 != 0) {
                    AnonymousClass0OU.A00(obj);
                    break;
                } else {
                    AnonymousClass0OU.A00(obj);
                    FollowerListDataSource followerListDataSource = (FollowerListDataSource) this.A01;
                    followerListDataSource.A00 = null;
                    String str2 = this.A02;
                    this.A00 = 1;
                    if (FollowerListDataSource.A00(followerListDataSource, (String) null, str2, this, true) == d0e2) {
                        return d0e2;
                    }
                }
                break;
            default:
                D0E d0e3 = D0E.COROUTINE_SUSPENDED;
                if (this.A00 != 0) {
                    AnonymousClass0OU.A00(obj);
                } else {
                    AnonymousClass0OU.A00(obj);
                    IGTVSeriesNetworkDataSource iGTVSeriesNetworkDataSource = ((IGTVSeriesRepository) this.A01).A00;
                    String str3 = this.A02;
                    this.A00 = 1;
                    obj = iGTVSeriesNetworkDataSource.A05(str3, this);
                    if (obj == d0e3) {
                        return d0e3;
                    }
                }
                C62903b6 r6 = (C62903b6) obj;
                if (r6 instanceof AnonymousClass1jA) {
                    return ((AnonymousClass1jA) r6).A00;
                }
                if (r6 instanceof AnonymousClass1jB) {
                    throw new AnonymousClass667(AnonymousClass000.A00(19));
                }
                throw AnonymousClass4VZ.A00();
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape3S1101000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
