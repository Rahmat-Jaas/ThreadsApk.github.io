package X;

import android.os.SystemClock;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* renamed from: X.7mK  reason: invalid class name and case insensitive filesystem */
public final class C129687mK implements C143878hS {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C113816sC A03;
    public final AnonymousClass7MI A04;

    public C129687mK(C113816sC r1, AnonymousClass7MI r2, int i, long j, long j2) {
        this.A04 = r2;
        this.A00 = i;
        this.A03 = r1;
        this.A01 = j;
        this.A02 = j2;
    }

    public static ConnectionTelemetryConfiguration A00(AnonymousClass7lO r6, C121837Ij r7, int i) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        zzj zzj = r7.A0Q;
        if (zzj == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = zzj.A02;
        }
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.A02) {
            int[] iArr = connectionTelemetryConfiguration.A04;
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (iArr[i2] == i) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                int[] iArr2 = connectionTelemetryConfiguration.A05;
                if (iArr2 != null) {
                    int length2 = iArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (iArr2[i3] == i) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (r6.A00 < connectionTelemetryConfiguration.A00) {
                return connectionTelemetryConfiguration;
            }
        }
        return null;
    }

    public final void BrG(AnonymousClass7HU r22) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        AnonymousClass7MI r7 = this.A04;
        if (r7.A06()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = AnonymousClass7DN.A00().A00;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.A03) {
                AnonymousClass7lO r9 = (AnonymousClass7lO) r7.A09.get(this.A03);
                if (r9 != null) {
                    C148598rX r3 = r9.A04;
                    if (r3 instanceof C121837Ij) {
                        C121837Ij r32 = (C121837Ij) r3;
                        long j2 = this.A01;
                        boolean z = true;
                        long j3 = 0;
                        boolean A1X = C18180wK.A1X((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                        int i7 = r32.A0E;
                        if (rootTelemetryConfiguration != null) {
                            A1X &= rootTelemetryConfiguration.A04;
                            i2 = rootTelemetryConfiguration.A01;
                            i3 = rootTelemetryConfiguration.A02;
                            i = rootTelemetryConfiguration.A00;
                            if (r32.A0Q != null && !r32.BST()) {
                                ConnectionTelemetryConfiguration A002 = A00(r9, r32, this.A00);
                                if (A002 != null) {
                                    if (!A002.A03 || j2 <= 0) {
                                        z = false;
                                    }
                                    i3 = A002.A00;
                                    A1X = z;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        AnonymousClass7HU r33 = r22;
                        if (r33.A0C()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (r33.A05) {
                                i4 = 100;
                            } else {
                                Exception A032 = r33.A03();
                                if (A032 instanceof C32102Af) {
                                    Status status = ((C32102Af) A032).A00;
                                    i4 = status.A01;
                                    ConnectionResult connectionResult = status.A03;
                                    if (connectionResult != null) {
                                        i5 = connectionResult.A01;
                                    }
                                } else {
                                    i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                                }
                            }
                            i5 = -1;
                        }
                        if (A1X) {
                            j3 = j2;
                            j = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - this.A02);
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        C86124wJ.A1E(r7.A06, new C109846ki(new MethodInvocation((String) null, (String) null, this.A00, i4, i5, i7, i6, j3, j), i, i3, (long) i2), 18);
                    }
                }
            }
        }
    }
}
