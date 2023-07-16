package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Ij  reason: invalid class name and case insensitive filesystem */
public abstract class C121837Ij {
    public static final Feature[] A0T = new Feature[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public ConnectionResult A07 = null;
    public C143808hL A08;
    public IGmsServiceBroker A09;
    public C107476go A0A;
    public AtomicInteger A0B = new AtomicInteger(0);
    public boolean A0C = false;
    public AnonymousClass7M1 A0D;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final C142208eI A0H;
    public final AnonymousClass8eJ A0I;
    public final Object A0J = C86144wL.A0d();
    public final Object A0K = C86144wL.A0d();
    public final String A0L;
    public final ArrayList A0M = AnonymousClass0wJ.A0v();
    public final Looper A0N;
    public final C121217Ev A0O;
    public final AnonymousClass7H7 A0P;
    public volatile zzj A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public static final void A00(IInterface iInterface, C121837Ij r8, int i) {
        String str;
        boolean z;
        C107476go r0;
        boolean z2 = true;
        if (i != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            synchronized (r8.A0J) {
                r8.A02 = i;
                r8.A06 = iInterface;
                if (i == 1) {
                    AnonymousClass7M1 r4 = r8.A0D;
                    if (r4 != null) {
                        AnonymousClass7H7 r3 = r8.A0P;
                        C107476go r02 = r8.A0A;
                        String str2 = r02.A00;
                        C13320nQ.A01(str2);
                        r3.A01(r4, new AnonymousClass7Em(str2, r02.A01));
                        r8.A0D = null;
                    }
                } else if (i == 2 || i == 3) {
                    AnonymousClass7M1 r42 = r8.A0D;
                    if (!(r42 == null || (r0 = r8.A0A) == null)) {
                        String str3 = r0.A00;
                        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str3) + 70 + C86104wH.A0A("com.google.android.gms"));
                        A0s.append("Calling connect() while still connected, missing disconnect() for ");
                        A0s.append(str3);
                        A0s.append(" on ");
                        Log.e("GmsClient", C18180wK.A0i("com.google.android.gms", A0s));
                        AnonymousClass7H7 r32 = r8.A0P;
                        C107476go r03 = r8.A0A;
                        String str4 = r03.A00;
                        C13320nQ.A01(str4);
                        r32.A01(r42, new AnonymousClass7Em(str4, r03.A01));
                        r8.A0B.incrementAndGet();
                    }
                    AtomicInteger atomicInteger = r8.A0B;
                    AnonymousClass7M1 r7 = new AnonymousClass7M1(r8, atomicInteger.get());
                    r8.A0D = r7;
                    if (r8 instanceof C93615lt) {
                        str = "com.google.android.gms.signin.service.START";
                    } else if (r8 instanceof C93565lo) {
                        str = "com.google.android.gms.safetynet.service.START";
                    } else if (r8 instanceof C93595lr) {
                        str = "com.google.android.location.internal.GoogleLocationManagerService.START";
                    } else if (r8 instanceof C93535ll) {
                        str = "com.google.android.gms.auth.blockstore.service.START";
                    } else if (r8 instanceof C93575lp) {
                        str = "com.google.android.gms.auth.account.authapi.START";
                    } else if (r8 instanceof C93585lq) {
                        str = "com.google.android.gms.auth.service.START";
                    } else if (r8 instanceof C93555ln) {
                        str = "com.google.android.gms.auth.api.credentials.service.START";
                    } else if (r8 instanceof C93525lk) {
                        str = "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                    } else if (r8 instanceof C93545lm) {
                        str = "com.google.android.gms.common.telemetry.service.START";
                    } else {
                        str = "com.google.android.gms.auth.api.signin.service.START";
                    }
                    if ((r8 instanceof C93535ll) || (r8 instanceof C93575lp) || (r8 instanceof C93545lm)) {
                        z = true;
                    } else {
                        z = C86114wI.A1U(r8.Ave(), 211700000);
                    }
                    C107476go r2 = new C107476go(str, z);
                    r8.A0A = r2;
                    boolean z4 = r2.A01;
                    if (!z4 || r8.Ave() >= 17895000) {
                        AnonymousClass7H7 r33 = r8.A0P;
                        String str5 = r2.A00;
                        C13320nQ.A01(str5);
                        String str6 = r8.A0L;
                        if (str6 == null) {
                            str6 = C18220wO.A0q(r8.A0F);
                        }
                        if (!r33.A02(r7, new AnonymousClass7Em(str5, z4), str6)) {
                            String str7 = r8.A0A.A00;
                            StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(str7) + 34 + C86104wH.A0A("com.google.android.gms"));
                            A0s2.append("unable to connect to service: ");
                            A0s2.append(str7);
                            A0s2.append(" on ");
                            Log.w("GmsClient", C18180wK.A0i("com.google.android.gms", A0s2));
                            int i2 = atomicInteger.get();
                            Handler handler = r8.A0G;
                            handler.sendMessage(handler.obtainMessage(7, i2, -1, new AnonymousClass5ol(r8, 16)));
                        }
                    } else {
                        throw C18180wK.A0a(C86104wH.A0u(r2.A00, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                } else if (i == 4) {
                    C13320nQ.A01(iInterface);
                    r8.A04 = System.currentTimeMillis();
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public abstract int Ave();

    /* JADX INFO: finally extract failed */
    public final void B6o(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A062;
        Feature[] featureArr;
        if (this instanceof C93615lt) {
            C93615lt r4 = (C93615lt) this;
            String str = r4.A01.A02;
            if (!r4.A0F.getPackageName().equals(str)) {
                r4.A00.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            }
            A062 = r4.A00;
        } else if (this instanceof C93595lr) {
            A062 = C18180wK.A06();
            A062.putString("client_name", ((C93595lr) this).A01);
        } else if (this instanceof C93585lq) {
            A062 = ((C93585lq) this).A00;
        } else if (this instanceof C93555ln) {
            C129107lI r2 = ((C93555ln) this).A00;
            A062 = C18180wK.A06();
            A062.putString("consumer_package", (String) null);
            A062.putBoolean("force_save_dialog", r2.A01);
            A062.putString("log_session_id", r2.A00);
        } else {
            A062 = C18180wK.A06();
        }
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.A0E, this.A0R);
        getServiceRequest.A05 = this.A0F.getPackageName();
        getServiceRequest.A03 = A062;
        if (set != null) {
            getServiceRequest.A0B = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (CeJ()) {
            getServiceRequest.A02 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.A04 = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.A09 = A0T;
        if (this instanceof C93595lr) {
            featureArr = C103806al.A02;
        } else if (this instanceof C93535ll) {
            featureArr = C103896au.A08;
        } else if (this instanceof C93575lp) {
            featureArr = new Feature[]{C103886at.A00, C103886at.A01};
        } else if (this instanceof C93525lk) {
            featureArr = C103796ak.A04;
        } else if (this instanceof C93545lm) {
            featureArr = C103446Zf.A01;
        } else {
            featureArr = A0T;
        }
        getServiceRequest.A0A = featureArr;
        if (this instanceof C93535ll) {
            getServiceRequest.A08 = true;
        }
        try {
            synchronized (this.A0K) {
                IGmsServiceBroker iGmsServiceBroker = this.A09;
                if (iGmsServiceBroker != null) {
                    zzd zzd = new zzd(this, this.A0B.get());
                    zzac zzac = (zzac) iGmsServiceBroker;
                    int A032 = C14030oh.A03(-1514591822);
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(zzd.asBinder());
                        obtain.writeInt(1);
                        PCreatorCreatorShape5S0000000_I2_5.A00(obtain, getServiceRequest, 0);
                        zzac.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        C14030oh.A0A(1129537221, A032);
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        C14030oh.A0A(-613250953, A032);
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0B.get(), 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i = this.A0B.get();
            Handler handler2 = this.A0G;
            handler2.sendMessage(handler2.obtainMessage(1, i, -1, new AnonymousClass5om((Bundle) null, (IBinder) null, this, 8)));
        }
    }

    public boolean CYG() {
        return false;
    }

    public boolean CeJ() {
        return false;
    }

    public static void A01(C143808hL r1, C121837Ij r2) {
        C13320nQ.A02(r1, "Connection progress callbacks cannot be null.");
        r2.A08 = r1;
        A00((IInterface) null, r2, 2);
    }

    public static /* bridge */ /* synthetic */ boolean A02(IInterface iInterface, C121837Ij r3, int i, int i2) {
        synchronized (r3.A0J) {
            if (r3.A02 != i) {
                return false;
            }
            A00(iInterface, r3, i2);
            return true;
        }
    }

    public final IInterface A03() {
        Throwable th;
        IInterface iInterface;
        synchronized (this.A0J) {
            if (this.A02 == 5) {
                th = new DeadObjectException();
            } else if (isConnected()) {
                iInterface = this.A06;
                C13320nQ.A02(iInterface, "Client is connected but service is null");
            } else {
                th = C18180wK.A0a("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            throw th;
        }
        return iInterface;
    }

    public final String A04() {
        if (this instanceof C93615lt) {
            return "com.google.android.gms.signin.internal.ISignInService";
        }
        if (this instanceof C93565lo) {
            return "com.google.android.gms.safetynet.internal.ISafetyNetService";
        }
        if (this instanceof C93595lr) {
            return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        }
        if (this instanceof C93535ll) {
            return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
        }
        if (this instanceof C93575lp) {
            return "com.google.android.gms.auth.account.data.IGoogleAuthService";
        }
        if (this instanceof C93585lq) {
            return "com.google.android.gms.auth.api.internal.IAuthService";
        }
        if (this instanceof C93555ln) {
            return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
        }
        if (this instanceof C93525lk) {
            return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
        }
        if (this instanceof C93545lm) {
            return "com.google.android.gms.common.internal.service.IClientTelemetryService";
        }
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public void AI7() {
        this.A0B.incrementAndGet();
        ArrayList arrayList = this.A0M;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C108966jF r1 = (C108966jF) arrayList.get(i);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0K) {
            this.A09 = null;
        }
        A00((IInterface) null, this, 1);
    }

    public void AI8(String str) {
        this.A0S = str;
        AI7();
    }

    public Intent BC8() {
        throw C86134wK.A0s("Not a sign in API");
    }

    public final boolean BST() {
        boolean z;
        synchronized (this.A0J) {
            int i = this.A02;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean isConnected() {
        boolean A1T;
        synchronized (this.A0J) {
            A1T = AnonymousClass0wJ.A1T(this.A02, 4);
        }
        return A1T;
    }

    public C121837Ij(Context context, Looper looper, C121217Ev r6, C142208eI r7, AnonymousClass8eJ r8, AnonymousClass7H7 r9, String str, int i) {
        C13320nQ.A02(context, "Context must not be null");
        this.A0F = context;
        C13320nQ.A02(looper, "Looper must not be null");
        this.A0N = looper;
        C13320nQ.A02(r9, "Supervisor must not be null");
        this.A0P = r9;
        C13320nQ.A02(r6, "API availability must not be null");
        this.A0O = r6;
        this.A0G = new AnonymousClass5q4(looper, this);
        this.A0E = i;
        this.A0H = r7;
        this.A0I = r8;
        this.A0L = str;
    }
}
