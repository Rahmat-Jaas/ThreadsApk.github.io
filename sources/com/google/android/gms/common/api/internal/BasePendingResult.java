package com.google.android.gms.common.api.internal;

import X.AnonymousClass0wJ;
import X.AnonymousClass412;
import X.AnonymousClass5lP;
import X.AnonymousClass5pO;
import X.AnonymousClass5pP;
import X.AnonymousClass5pQ;
import X.AnonymousClass5pR;
import X.AnonymousClass5pv;
import X.AnonymousClass7AL;
import X.C105076cq;
import X.C113286r5;
import X.C129207lV;
import X.C129577m8;
import X.C13320nQ;
import X.C1375288x;
import X.C143748hF;
import X.C143758hG;
import X.C18180wK;
import X.C82014ow;
import X.C86124wJ;
import X.C86144wL;
import X.C93275lI;
import X.C93285lJ;
import X.C93325lN;
import X.C93335lO;
import X.C93655qd;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.safetynet.zza;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C113286r5 {
    public static final ThreadLocal A0E = new C1375288x();
    public C82014ow A00;
    public C143758hG A01;
    public Status A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass5pv A06;
    public final Object A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final CountDownLatch A0A;
    public final AtomicReference A0B;
    public volatile boolean A0C;
    public volatile C129207lV A0D;

    public static final C82014ow A00(BasePendingResult basePendingResult) {
        C82014ow r2;
        synchronized (basePendingResult.A07) {
            C13320nQ.A07(!basePendingResult.A0C, "Result has already been consumed.");
            C13320nQ.A07(C18180wK.A1W((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            r2 = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A01 = null;
            basePendingResult.A0C = true;
        }
        C105076cq r0 = (C105076cq) basePendingResult.A0B.getAndSet((Object) null);
        if (r0 != null) {
            r0.A00.A01.remove(basePendingResult);
        }
        C13320nQ.A01(r2);
        return r2;
    }

    private final void A01(C82014ow r6) {
        this.A00 = r6;
        this.A02 = r6.BDf();
        this.A0A.countDown();
        if (this.A03) {
            this.A01 = null;
        } else {
            C143758hG r3 = this.A01;
            if (r3 != null) {
                AnonymousClass5pv r2 = this.A06;
                r2.removeMessages(2);
                C86124wJ.A1E(r2, new Pair(r3, A00(this)), 1);
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C143748hF) arrayList.get(i)).Br9(this.A02);
        }
        arrayList.clear();
    }

    public final C82014ow A04(Status status) {
        if (this instanceof AnonymousClass5lP) {
            return ((AnonymousClass5lP) this).A00;
        }
        if (!(this instanceof C93335lO)) {
            if (this instanceof C93655qd) {
                return new C129577m8(status, (zza) null);
            }
            if (this instanceof C93325lN) {
                return new LocationSettingsResult(status, (LocationSettingsStates) null);
            }
            if (!(this instanceof AnonymousClass5pO) && !(this instanceof AnonymousClass5pR) && !(this instanceof AnonymousClass5pQ) && (this instanceof AnonymousClass5pP)) {
                return new AnonymousClass412((Credential) null, status);
            }
        }
        return status;
    }

    public final void A05() {
        synchronized (this.A07) {
            if (!this.A03 && !this.A0C) {
                this.A03 = true;
                A01(A04(Status.A05));
            }
        }
    }

    public final void A06() {
        boolean z = true;
        if (!this.A04 && !AnonymousClass0wJ.A1X(A0E.get())) {
            z = false;
        }
        this.A04 = z;
    }

    public final void A07(C82014ow r7) {
        synchronized (this.A07) {
            if (!this.A05 && !this.A03) {
                CountDownLatch countDownLatch = this.A0A;
                countDownLatch.getCount();
                C13320nQ.A07(!C18180wK.A1W((countDownLatch.getCount() > 0 ? 1 : (countDownLatch.getCount() == 0 ? 0 : -1))), "Results have already been set");
                C13320nQ.A07(!this.A0C, "Result has already been consumed");
                A01(r7);
            }
        }
    }

    public final void A08(Status status) {
        synchronized (this.A07) {
            if (!C18180wK.A1W((this.A0A.getCount() > 0 ? 1 : (this.A0A.getCount() == 0 ? 0 : -1)))) {
                A07(A04(status));
                this.A05 = true;
            }
        }
    }

    public BasePendingResult(AnonymousClass7AL r3) {
        Looper mainLooper;
        this.A07 = C86144wL.A0d();
        this.A0A = new CountDownLatch(1);
        this.A09 = AnonymousClass0wJ.A0v();
        this.A0B = new AtomicReference();
        this.A04 = false;
        if (r3 == null) {
            mainLooper = Looper.getMainLooper();
        } else if (r3 instanceof C93275lI) {
            mainLooper = ((C93275lI) r3).A00.A02;
        } else {
            mainLooper = ((C93285lJ) r3).A06;
        }
        this.A06 = new AnonymousClass5pv(mainLooper);
        this.A08 = C86144wL.A0w(r3);
    }

    public BasePendingResult() {
        this.A07 = C86144wL.A0d();
        this.A0A = new CountDownLatch(1);
        this.A09 = AnonymousClass0wJ.A0v();
        this.A0B = new AtomicReference();
        this.A04 = false;
        this.A06 = new AnonymousClass5pv(Looper.getMainLooper());
        this.A08 = C86144wL.A0w((Object) null);
    }
}
