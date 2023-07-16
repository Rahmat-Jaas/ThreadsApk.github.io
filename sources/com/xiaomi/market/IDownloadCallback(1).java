package com.xiaomi.market;

import X.C14030oh;
import X.C86104wH;
import X.C86114wI;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IDownloadCallback extends IInterface {

    public abstract class Stub extends Binder implements IDownloadCallback {

        public final class Proxy implements IDownloadCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(2001306125);
                this.A00 = iBinder;
                C14030oh.A0A(-1078892535, A03);
            }

            public final void Bwj(String str, int i, String str2) {
                int A03 = C14030oh.A03(-2107269528);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1818176817, A03);
                }
            }

            public final void Bwu(String str, int i, String str2, String str3) {
                int A03 = C14030oh.A03(838966537);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    C86114wI.A14(obtain, str2, str3, i);
                    C86104wH.A19(this.A00, obtain, obtain2, 5);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(64165828, A03);
                }
            }

            public final void CDU(String str, long j, float f) {
                int A03 = C14030oh.A03(-564295723);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    C86104wH.A19(this.A00, obtain, obtain2, 3);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-259536704, A03);
                }
            }

            public final void CDW(String str, long j, float f, String str2) {
                int A03 = C14030oh.A03(38792612);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 6);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1920558699, A03);
                }
            }

            public final void CMF(String str, int i, String str2) {
                int A03 = C14030oh.A03(98528078);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C86104wH.A19(this.A00, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-865783883, A03);
                }
            }

            public final void CMG(String str, int i, String str2, String str3) {
                int A03 = C14030oh.A03(330243241);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
                    obtain.writeString(str);
                    C86114wI.A14(obtain, str2, str3, i);
                    C86104wH.A19(this.A00, obtain, obtain2, 4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(28403453, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(1509759323);
                IBinder iBinder = this.A00;
                C14030oh.A0A(1713897700, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(2052793266);
            attachInterface(this, "com.xiaomi.market.IDownloadCallback");
            C14030oh.A0A(1552423430, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(-668395579, C14030oh.A03(-762425002));
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
            r15.writeNoException();
            r0 = 1062406180;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r13, android.os.Parcel r14, android.os.Parcel r15, int r16) {
            /*
                r12 = this;
                r0 = -2109416729(0xffffffff8244dae7, float:-1.4462628E-37)
                int r3 = X.C14030oh.A03(r0)
                r2 = 1
                java.lang.String r1 = "com.xiaomi.market.IDownloadCallback"
                r6 = r12
                if (r13 < r2) goto L_0x0018
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r13 > r0) goto L_0x0025
                r14.enforceInterface(r1)
                switch(r13) {
                    case 1: goto L_0x008d;
                    case 2: goto L_0x007d;
                    case 3: goto L_0x006d;
                    case 4: goto L_0x0059;
                    case 5: goto L_0x0045;
                    case 6: goto L_0x0031;
                    default: goto L_0x0018;
                }
            L_0x0018:
                r0 = r16
                boolean r1 = super.onTransact(r13, r14, r15, r0)
                r0 = 30349999(0x1cf1aaf, float:7.607808E-38)
                X.C14030oh.A0A(r0, r3)
                return r1
            L_0x0025:
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r13 != r0) goto L_0x0018
                r15.writeString(r1)
                r0 = -1543774960(0xffffffffa3fbdd10, float:-2.7307098E-17)
                goto L_0x00a2
            L_0x0031:
                java.lang.String r7 = r14.readString()
                long r8 = r14.readLong()
                float r10 = r14.readFloat()
                java.lang.String r11 = r14.readString()
                r6.CDW(r7, r8, r10, r11)
                goto L_0x009c
            L_0x0045:
                java.lang.String r5 = r14.readString()
                int r4 = r14.readInt()
                java.lang.String r1 = r14.readString()
                java.lang.String r0 = r14.readString()
                r12.Bwu(r5, r4, r1, r0)
                goto L_0x009c
            L_0x0059:
                java.lang.String r5 = r14.readString()
                int r4 = r14.readInt()
                java.lang.String r1 = r14.readString()
                java.lang.String r0 = r14.readString()
                r12.CMG(r5, r4, r1, r0)
                goto L_0x009c
            L_0x006d:
                java.lang.String r5 = r14.readString()
                long r0 = r14.readLong()
                float r4 = r14.readFloat()
                r12.CDU(r5, r0, r4)
                goto L_0x009c
            L_0x007d:
                java.lang.String r4 = r14.readString()
                int r1 = r14.readInt()
                java.lang.String r0 = r14.readString()
                r12.Bwj(r4, r1, r0)
                goto L_0x009c
            L_0x008d:
                java.lang.String r4 = r14.readString()
                int r1 = r14.readInt()
                java.lang.String r0 = r14.readString()
                r12.CMF(r4, r1, r0)
            L_0x009c:
                r15.writeNoException()
                r0 = 1062406180(0x3f530824, float:0.82434297)
            L_0x00a2:
                X.C14030oh.A0A(r0, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.market.IDownloadCallback.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void Bwj(String str, int i, String str2);

    void Bwu(String str, int i, String str2, String str3);

    void CDU(String str, long j, float f);

    void CDW(String str, long j, float f, String str2);

    void CMF(String str, int i, String str2);

    void CMG(String str, int i, String str2, String str3);
}
