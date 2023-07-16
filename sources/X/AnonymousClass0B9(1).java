package X;

import com.facebook.analytics2.logger.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0B9  reason: invalid class name */
public final class AnonymousClass0B9 implements Iterator {
    public C05500Tz A00;
    public boolean A01;
    public int A02;
    public AnonymousClass0AW A03;
    public File A04;
    public final long A05 = (AnonymousClass0AJ.A00() - 7);
    public final long A06 = (AnonymousClass0AJ.A01() - 168);
    public final int A07;
    public final AnonymousClass0AQ A08;
    public final AnonymousClass0AT A09;
    public final DefaultFalcoAcsProvider A0A;
    public final AnonymousClass0EU A0B;

    private C05500Tz A00() {
        C05500Tz r0;
        long j;
        long j2;
        AnonymousClass0B8 r6 = new AnonymousClass0B8();
        ArrayList arrayList = new ArrayList(4);
        AnonymousClass0AM r11 = null;
        int i = 0;
        while (true) {
            if (i != 0 && i >= this.A07) {
                break;
            }
            AnonymousClass0AQ r1 = this.A08;
            if (!r1.hasNext()) {
                break;
            } else if (r1.hasNext()) {
                AnonymousClass0AO r02 = r1.A00;
                r1.A00 = null;
                r1.A01 = false;
                AnonymousClass0AM r5 = r02.A01;
                int i2 = r02.A00;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (r11 != null) {
                            File file = r5.A00;
                            A01(file);
                            if (r11.A00.equals(file)) {
                                r11 = null;
                            }
                        } else {
                            r6.A00.add(r5);
                        }
                        if (r5 instanceof C04990Qf) {
                            AnonymousClass0EU r3 = this.A0B;
                            File file2 = r5.A00;
                            r3.A00.A07.put(file2.getName(), this.A04);
                            this.A04 = null;
                        }
                    } else if (r11 != null) {
                        File file3 = r5.A00;
                        AnonymousClass0AV A022 = this.A03.A02(file3);
                        try {
                            if (A022.A0B(this)) {
                                if (file3.delete()) {
                                    A022.A07(this);
                                    A022.A05();
                                    A022.A08(this);
                                    A022.A03();
                                } else {
                                    A022.A08(this);
                                }
                            }
                            A022.A03();
                        } catch (Throwable th) {
                            A022.A03();
                            throw th;
                        }
                    } else {
                        File file4 = r5.A00;
                        if (file4.length() == 0) {
                            file4.getName();
                        } else {
                            C017608i r2 = new C017608i(this.A09, this.A03, this.A0A, file4);
                            arrayList.add(r2);
                            i = (int) (((long) i) + r2.A00.length());
                            this.A04 = file4;
                        }
                    }
                } else if (r5 instanceof C04990Qf) {
                    this.A03 = AnonymousClass0AW.A00(!r5.A00.getName().equals(C29896Fw7.A00()));
                } else if (!(r5 instanceof C04980Qe)) {
                    continue;
                } else {
                    if (r5 instanceof C017808k) {
                        j = this.A05;
                    } else if (r5 instanceof C017708j) {
                        j = this.A06;
                    } else {
                        StringBuilder sb = new StringBuilder("directoryNode=");
                        sb.append(r5);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    int i3 = -1;
                    try {
                        long parseLong = Long.parseLong(r5.A00.getName());
                        i3 = parseLong;
                        j2 = parseLong;
                    } catch (NumberFormatException unused) {
                        j2 = (long) i3;
                    }
                    if (j2 < 0 || j2 < j) {
                        r11 = r5;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        this.A02 += size;
        if (size > 1) {
            arrayList.size();
            r0 = new AnonymousClass0Qb(this.A09, arrayList);
        } else {
            r0 = (C05500Tz) arrayList.get(0);
        }
        return new C04960Qc(r0, r6);
    }

    public final boolean hasNext() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = A00();
        }
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    public final void remove() {
        throw new UnsupportedOperationException("File removal should be accomplished via markSuccessful");
    }

    public AnonymousClass0B9(AnonymousClass0AT r5, DefaultFalcoAcsProvider defaultFalcoAcsProvider, AnonymousClass0EU r7, File file, int i) {
        this.A08 = new AnonymousClass0AQ(new C05000Qh(file));
        this.A09 = r5;
        this.A0B = r7;
        this.A07 = i;
        this.A0A = defaultFalcoAcsProvider;
    }

    public static void A01(File file) {
        if (!file.isDirectory()) {
            AnonymousClass0LU.A0O("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", file);
        }
        file.delete();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C05500Tz r1 = this.A00;
            this.A01 = false;
            this.A00 = null;
            return r1;
        }
        throw new IllegalStateException();
    }
}
