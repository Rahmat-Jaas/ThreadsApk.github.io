package androidx.paging;

import X.AnonymousClass0YY;
import X.AnonymousClass67F;
import X.AnonymousClass6D2;
import X.AnonymousClass6ZB;
import X.AnonymousClass86J;
import X.C04220Ms;
import X.C108646ii;
import X.C115226ui;
import X.C1197776w;
import X.C125067cM;
import X.C14030oh;
import X.C141478bg;
import X.C141958dY;
import X.C146958n9;
import X.C25295DjG;
import X.C41030Luu;
import X.C84714tk;
import X.C86134wK;
import X.D0E;
import X.JWT;
import X.MAU;
import android.util.Log;
import androidx.recyclerview.widget.IDxDObserverShape52S0100000_2_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2;

public abstract class PagingDataAdapter extends C41030Luu {
    public boolean A00;
    public final AsyncPagingDataDiffer A01;
    public final C84714tk A02;
    public final C84714tk A03;

    public final void setStateRestorationPolicy(AnonymousClass67F r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = true;
        super.setStateRestorationPolicy(r2);
    }

    public /* synthetic */ PagingDataAdapter(JWT jwt) {
        C141478bg r3 = AnonymousClass6ZB.A00;
        C04220Ms.A0B(r3, 2);
        AsyncPagingDataDiffer asyncPagingDataDiffer = new AsyncPagingDataDiffer(jwt, new MAU(this), r3, C25295DjG.A00);
        this.A01 = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(AnonymousClass67F.PREVENT);
        registerAdapterDataObserver(new IDxDObserverShape52S0100000_2_I2(this, 0));
        A04(new AnonymousClass86J(this));
        this.A02 = asyncPagingDataDiffer.A07;
        this.A03 = asyncPagingDataDiffer.A08;
    }

    /* JADX INFO: finally extract failed */
    public final Object A01(int i) {
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        try {
            asyncPagingDataDiffer.A00 = true;
            Object A022 = asyncPagingDataDiffer.A01.A02(i);
            asyncPagingDataDiffer.A00 = false;
            return A022;
        } catch (Throwable th) {
            asyncPagingDataDiffer.A00 = false;
            throw th;
        }
    }

    public final Object A02(C108646ii r6, C146958n9 r7) {
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        asyncPagingDataDiffer.A05.incrementAndGet();
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.A01;
        Object A002 = asyncPagingDataDiffer$differBase$1.A06.A00(r7, new KtSLambdaShape26S0201000_I2(asyncPagingDataDiffer$differBase$1, r6, (C146958n9) null, 0));
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A002 != d0e) {
            A002 = Unit.A00;
        }
        if (A002 != d0e) {
            A002 = Unit.A00;
        }
        if (A002 != d0e) {
            return Unit.A00;
        }
        return A002;
    }

    public final void A03() {
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A01.A01;
        if (AnonymousClass6D2.A00 != null) {
            Log.isLoggable("Paging", 3);
        }
        C141958dY r0 = asyncPagingDataDiffer$differBase$1.A02;
        if (r0 != null) {
            ((C125067cM) r0).A01.A00.A00(true);
        }
    }

    public final void A04(AnonymousClass0YY r8) {
        C1197776w r1 = this.A01.A01.A04;
        r1.A06.add(r8);
        if (r1.A05) {
            r8.invoke(new C115226ui(r1.A02, r1.A01, r1.A00, r1.A04, r1.A03));
        }
    }

    public final void setHasStableIds(boolean z) {
        throw C86134wK.A0s("Stable ids are unsupported on PagingDataAdapter.");
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(-931894484);
        int size = this.A01.A01.A01.getSize();
        C14030oh.A0A(-1013771373, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = C14030oh.A03(-1405007841);
        long itemId = super.getItemId(i);
        C14030oh.A0A(-1251830307, A032);
        return itemId;
    }
}
