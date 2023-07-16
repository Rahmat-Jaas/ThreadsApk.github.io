package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YC;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.AnonymousClass59K;
import X.AnonymousClass59L;
import X.AnonymousClass59N;
import X.AnonymousClass67D;
import X.AnonymousClass67E;
import X.C04220Ms;
import X.C113226qx;
import X.C115476vB;
import X.C1201779c;
import X.C146368m8;
import X.C146958n9;
import X.C18180wK;
import X.C39142Kno;
import X.D0E;
import androidx.paging.PageEvent$Insert;
import androidx.paging.PageEvent$StaticList;
import java.util.List;
import kotlin.Unit;

public class KtSLambdaShape6S0501000_I2 extends C39142Kno implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape6S0501000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(4, r4);
        this.A06 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A06;
        C146958n9 r8 = (C146958n9) obj4;
        Object obj5 = this.A01;
        Object obj6 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape6S0501000_I2 ktSLambdaShape6S0501000_I2 = new KtSLambdaShape6S0501000_I2(obj5, obj6, r8, i);
        ktSLambdaShape6S0501000_I2.A03 = obj;
        ktSLambdaShape6S0501000_I2.A04 = obj2;
        ktSLambdaShape6S0501000_I2.A05 = obj3;
        return ktSLambdaShape6S0501000_I2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e;
        Object obj2;
        C146368m8 r1;
        C1201779c r0;
        if (this.A06 != 0) {
            d0e = D0E.COROUTINE_SUSPENDED;
            int i = this.A00;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass0wJ.A0a();
                }
                AnonymousClass0OU.A00(obj);
                return Unit.A00;
            }
            AnonymousClass0OU.A00(obj);
            Object obj3 = this.A03;
            Object obj4 = this.A04;
            Object obj5 = this.A05;
            C146368m8 r2 = (C146368m8) this.A01;
            Object obj6 = (C113226qx) obj4;
            C1201779c r8 = (C1201779c) obj3;
            if (obj5 == AnonymousClass67D.RECEIVER) {
                r0 = ((C115476vB) this.A02).A01();
                obj6 = new AnonymousClass59L(r0, r8);
            } else if (obj6 instanceof PageEvent$Insert) {
                PageEvent$Insert pageEvent$Insert = (PageEvent$Insert) obj6;
                ((C115476vB) this.A02).A03(pageEvent$Insert.A03);
                C1201779c r7 = pageEvent$Insert.A03;
                AnonymousClass67E r9 = pageEvent$Insert.A04;
                List list = pageEvent$Insert.A05;
                int i2 = pageEvent$Insert.A01;
                int i3 = pageEvent$Insert.A00;
                C04220Ms.A0B(r9, 0);
                C18180wK.A1Q(list, 1, r7);
                obj6 = new PageEvent$Insert(r7, r8, r9, list, i2, i3);
            } else if (obj6 instanceof AnonymousClass59N) {
                ((C115476vB) this.A02).A02(AnonymousClass59K.A01, ((AnonymousClass59N) obj6).A03);
            } else if (obj6 instanceof AnonymousClass59L) {
                AnonymousClass59L r6 = (AnonymousClass59L) obj6;
                ((C115476vB) this.A02).A03(r6.A01);
                r0 = r6.A01;
                obj6 = new AnonymousClass59L(r0, r8);
            } else if (obj6 instanceof PageEvent$StaticList) {
                throw C18180wK.A0a("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
            } else {
                throw AnonymousClass4VZ.A00();
            }
            this.A00 = 1;
            obj2 = r2.Cgt(obj6, this);
        } else {
            d0e = D0E.COROUTINE_SUSPENDED;
            int i4 = this.A00;
            if (i4 != 0) {
                if (i4 == 1) {
                    r1 = (C146368m8) this.A03;
                    AnonymousClass0OU.A00(obj);
                }
                AnonymousClass0OU.A00(obj);
                return Unit.A00;
            }
            AnonymousClass0OU.A00(obj);
            Object obj7 = this.A03;
            Object obj8 = this.A04;
            Object obj9 = this.A05;
            r1 = (C146368m8) this.A01;
            this.A03 = r1;
            this.A04 = null;
            this.A00 = 1;
            obj = ((AnonymousClass0YC) this.A02).invoke(obj7, obj8, obj9, this);
            if (obj == d0e) {
                return d0e;
            }
            this.A03 = null;
            this.A00 = 2;
            obj2 = r1.Cgt(obj, this);
        }
        if (obj2 == d0e) {
            return d0e;
        }
        return Unit.A00;
    }
}
