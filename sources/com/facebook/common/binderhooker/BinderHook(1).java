package com.facebook.common.binderhooker;

import X.AnonymousClass0FN;
import X.AnonymousClass0FP;
import X.AnonymousClass0K9;
import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;
import java.io.FileDescriptor;
import java.lang.reflect.Field;

public abstract class BinderHook extends Binder implements IInterface {
    public static final AnonymousClass0K9 ML = new AnonymousClass0K9("BinderHook");
    public AnonymousClass0FN mCurrentHookedData = null;
    public final Object mLock = new Object();
    public final String mName = getClass().getSimpleName();
    public boolean mShouldTransparentlyConvert = false;

    public BinderHook() {
        int A03 = C14030oh.A03(389790626);
        C14030oh.A0A(-1655867106, A03);
        C14030oh.A0A(-1194310546, C14030oh.A03(-376421738));
    }

    private Binder getHookedBinderIfShouldCall() {
        int A03 = C14030oh.A03(931153262);
        Binder hookedBinder = getHookedBinder();
        C14030oh.A0A(-1067414401, A03);
        return hookedBinder;
    }

    private Binder getHookedBinder_native() {
        int A03 = C14030oh.A03(2109027204);
        Binder hookedBinder = getHookedBinder();
        C14030oh.A0A(-443399799, A03);
        return hookedBinder;
    }

    private long getHookedDataPtr_native() {
        long j;
        AnonymousClass0FP r0;
        int A03 = C14030oh.A03(579033870);
        int A032 = C14030oh.A03(1102772852);
        getWrappedObjToUse();
        int A033 = C14030oh.A03(-791329220);
        AnonymousClass0FN r02 = this.mCurrentHookedData;
        if (r02 == null || (r0 = r02.A01) == null) {
            j = 0;
        } else {
            j = r0.A00;
        }
        C14030oh.A0A(1118293812, A033);
        C14030oh.A0A(726620739, A032);
        C14030oh.A0A(-2094432216, A03);
        return j;
    }

    private BinderHook getWrappedObjToUse() {
        C14030oh.A0A(886191166, C14030oh.A03(2099686188));
        return null;
    }

    public IBinder asBinder() {
        int i;
        int A03 = C14030oh.A03(239049395);
        IBinder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall == null || !(hookedBinderIfShouldCall instanceof IInterface)) {
            i = 1475318014;
        } else {
            hookedBinderIfShouldCall = ((IInterface) hookedBinderIfShouldCall).asBinder();
            i = -809780118;
        }
        C14030oh.A0A(i, A03);
        return hookedBinderIfShouldCall;
    }

    public void clearHookedBinderData() {
        Binder binder;
        String interfaceDescriptor;
        int i;
        int A03 = C14030oh.A03(-1575160925);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            int A032 = C14030oh.A03(-697685446);
            String str = wrappedObjToUse.mName;
            C14030oh.A0A(190782397, A032);
            Object[] objArr = {this.mName, str};
            wrappedObjToUse.clearHookedBinderData();
            i = 967941669;
        } else {
            AnonymousClass0FN r3 = this.mCurrentHookedData;
            if (r3 == null) {
                binder = null;
            } else {
                binder = r3.A00;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = this.mName;
            if (binder == null) {
                interfaceDescriptor = "<Null Binder>";
            } else {
                interfaceDescriptor = binder.getInterfaceDescriptor();
                if (interfaceDescriptor == null) {
                    interfaceDescriptor = "<No Interface Desc>";
                }
            }
            objArr2[1] = interfaceDescriptor;
            objArr2[2] = r3;
            synchronized (this.mLock) {
                try {
                    this.mCurrentHookedData = null;
                } catch (Throwable th) {
                    while (true) {
                        C14030oh.A0A(2104934050, A03);
                        throw th;
                    }
                }
            }
            i = 615164817;
        }
        C14030oh.A0A(i, A03);
    }

    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = C14030oh.A03(-829322259);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dump(fileDescriptor, strArr);
            i = 612626007;
        } else {
            super.dump(fileDescriptor, strArr);
            i = -1741515878;
        }
        C14030oh.A0A(i, A03);
    }

    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = C14030oh.A03(1585412868);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dumpAsync(fileDescriptor, strArr);
            i = -211636046;
        } else {
            super.dumpAsync(fileDescriptor, strArr);
            i = 341877525;
        }
        C14030oh.A0A(i, A03);
    }

    public Binder getHookedBinder() {
        Binder binder;
        int A03 = C14030oh.A03(-1116733962);
        getWrappedObjToUse();
        int A032 = C14030oh.A03(-1066733307);
        AnonymousClass0FN r0 = this.mCurrentHookedData;
        if (r0 == null) {
            binder = null;
        } else {
            binder = r0.A00;
        }
        C14030oh.A0A(1452682522, A032);
        C14030oh.A0A(-286122783, A03);
        return binder;
    }

    public String getInterfaceDescriptor() {
        String interfaceDescriptor;
        int i;
        int A03 = C14030oh.A03(-1236743041);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            interfaceDescriptor = hookedBinderIfShouldCall.getInterfaceDescriptor();
            i = 660187571;
        } else {
            interfaceDescriptor = super.getInterfaceDescriptor();
            i = -2079079549;
        }
        C14030oh.A0A(i, A03);
        return interfaceDescriptor;
    }

    public boolean isBinderAlive() {
        boolean isBinderAlive;
        int i;
        int A03 = C14030oh.A03(1770720429);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            isBinderAlive = hookedBinderIfShouldCall.isBinderAlive();
            i = 2127871636;
        } else {
            isBinderAlive = super.isBinderAlive();
            i = -1892620096;
        }
        C14030oh.A0A(i, A03);
        return isBinderAlive;
    }

    public boolean isHooked() {
        int A03 = C14030oh.A03(1872862619);
        getWrappedObjToUse();
        boolean z = false;
        if (this.mCurrentHookedData != null) {
            z = true;
        }
        C14030oh.A0A(1366081844, A03);
        return z;
    }

    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        int i2;
        int A03 = C14030oh.A03(1929404028);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.linkToDeath(deathRecipient, i);
            i2 = 602389253;
        } else {
            super.linkToDeath(deathRecipient, i);
            i2 = -837496000;
        }
        C14030oh.A0A(i2, A03);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        boolean z;
        AnonymousClass0FP r0;
        long j;
        long j2;
        int A03 = C14030oh.A03(-40174759);
        getWrappedObjToUse();
        AnonymousClass0FN r5 = this.mCurrentHookedData;
        ActivityThreadBinderHooker$ApplicationThreadBinderHook activityThreadBinderHooker$ApplicationThreadBinderHook = (ActivityThreadBinderHooker$ApplicationThreadBinderHook) this;
        int A032 = C14030oh.A03(2126590221);
        int i4 = i;
        activityThreadBinderHooker$ApplicationThreadBinderHook.A01.A01(activityThreadBinderHooker$ApplicationThreadBinderHook.A00, i, parcel);
        C14030oh.A0A(1764171646, A032);
        if (parcel != null) {
            parcel.setDataPosition(0);
        }
        Parcel parcel3 = parcel2;
        if (parcel2 != null) {
            parcel3.setDataPosition(0);
        }
        int i5 = i2;
        if (r5 == null || (r0 = r5.A01) == null) {
            ML.A07("Do not have snapshot of current hooked data, so can't call original binder. This can have serious issues. HookData: %s", r5);
        } else {
            if (parcel != null) {
                parcel.setDataPosition(0);
            }
            if (parcel2 != null) {
                parcel3.setDataPosition(0);
            }
            long j3 = r0.A00;
            if (NativeBinderHooker.PLATFORM_SUPPORTED) {
                try {
                    Field field = NativeBinderHooker.FIELD_Parcel_mNativePtr;
                    if (field != null) {
                        if (parcel == null) {
                            j = 0;
                        } else {
                            j = field.getLong(parcel);
                        }
                        if (parcel2 == null) {
                            j2 = 0;
                        } else {
                            j2 = field.getLong(parcel3);
                        }
                        int nativeCallOriginalBinderOnTransact = NativeBinderHooker.nativeCallOriginalBinderOnTransact(j3, i4, j, j2, i5);
                        if (nativeCallOriginalBinderOnTransact != 523) {
                            z = false;
                            if (nativeCallOriginalBinderOnTransact == 213) {
                                z = true;
                            }
                            i3 = 90620012;
                            C14030oh.A0A(i3, A03);
                            return z;
                        }
                    } else {
                        throw new IllegalAccessException();
                    }
                } catch (IllegalAccessException e) {
                    NativeBinderHooker.ML.A04("Call original binder on transact failed", e);
                }
            }
        }
        z = super.onTransact(i, parcel, parcel3, i5);
        i3 = 807025287;
        C14030oh.A0A(i3, A03);
        return z;
    }

    public boolean pingBinder() {
        boolean pingBinder;
        int i;
        int A03 = C14030oh.A03(-678205118);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            pingBinder = hookedBinderIfShouldCall.pingBinder();
            i = 508227447;
        } else {
            pingBinder = super.pingBinder();
            i = -983658150;
        }
        C14030oh.A0A(i, A03);
        return pingBinder;
    }

    public IInterface queryLocalInterface(String str) {
        IInterface queryLocalInterface;
        int i;
        int A03 = C14030oh.A03(1370005925);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            queryLocalInterface = hookedBinderIfShouldCall.queryLocalInterface(str);
            i = -1504908781;
        } else {
            queryLocalInterface = super.queryLocalInterface(str);
            i = 336920254;
        }
        C14030oh.A0A(i, A03);
        return queryLocalInterface;
    }

    public void setHookedBinderData(Binder binder, long j) {
        String interfaceDescriptor;
        int i;
        int A03 = C14030oh.A03(1207019107);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            int A032 = C14030oh.A03(-697685446);
            String str = wrappedObjToUse.mName;
            C14030oh.A0A(190782397, A032);
            Object[] objArr = {this.mName, str};
            wrappedObjToUse.setHookedBinderData(binder, j);
            i = -2048462348;
        } else {
            Object[] objArr2 = new Object[3];
            objArr2[0] = this.mName;
            if (binder == null) {
                interfaceDescriptor = "<Null Binder>";
            } else {
                interfaceDescriptor = binder.getInterfaceDescriptor();
                if (interfaceDescriptor == null) {
                    interfaceDescriptor = "<No Interface Desc>";
                }
            }
            objArr2[1] = interfaceDescriptor;
            objArr2[2] = Long.valueOf(j);
            synchronized (this.mLock) {
                try {
                    this.mCurrentHookedData = new AnonymousClass0FN(binder, j);
                } catch (Throwable th) {
                    while (true) {
                        C14030oh.A0A(597954832, A03);
                        throw th;
                    }
                }
            }
            i = -43519876;
        }
        C14030oh.A0A(i, A03);
    }

    public String toString() {
        String str;
        int A03 = C14030oh.A03(-2021918421);
        StringBuilder sb = new StringBuilder("[BinderHook ");
        sb.append(this.mName);
        sb.append('(');
        sb.append(getClass().getName());
        sb.append(')');
        sb.append(" Hooked Data: ");
        AnonymousClass0FN r0 = this.mCurrentHookedData;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = "Not Hooked";
        }
        sb.append(str);
        getWrappedObjToUse();
        sb.append(']');
        String obj = sb.toString();
        C14030oh.A0A(2065824159, A03);
        return obj;
    }

    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        boolean unlinkToDeath;
        int i2;
        int A03 = C14030oh.A03(1080247057);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            unlinkToDeath = hookedBinderIfShouldCall.unlinkToDeath(deathRecipient, i);
            i2 = -2145363977;
        } else {
            unlinkToDeath = super.unlinkToDeath(deathRecipient, i);
            i2 = -799434936;
        }
        C14030oh.A0A(i2, A03);
        return unlinkToDeath;
    }
}
