package X;

import android.text.TextUtils;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public final class C05970Xd implements C04050Mb {
    public byte A00;
    public byte A01;
    public byte A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public final File A0A;

    private int A01(ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = 0;
        int i3 = 24;
        do {
            i2 += (A00(byteBuffer) & 255) << i3;
            i3 -= 8;
            i++;
        } while (i < 4);
        return i2;
    }

    private short A04(ByteBuffer byteBuffer) {
        int i = 0;
        short s = 0;
        int i2 = 8;
        do {
            s = (short) (s + ((A00(byteBuffer) & 255) << i2));
            i2 -= 8;
            i++;
        } while (i < 2);
        return s;
    }

    private JSONObject A03(AnonymousClass0O4 r9, ByteBuffer byteBuffer, boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        int A012 = A01(byteBuffer);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msg_target", r9.A01(A04(byteBuffer)));
        String A013 = r9.A01(A04(byteBuffer));
        if (A013 != null) {
            jSONObject2.put("msg_callback", A013);
        }
        jSONObject2.put("msg_what", A01(byteBuffer));
        String A014 = r9.A01(A04(byteBuffer));
        if (A014 != null) {
            jSONObject2.put("msg_obj", A014);
        }
        short A042 = A04(byteBuffer);
        if (A042 > 0) {
            jSONObject2.put("wait_time_ms", A042);
        }
        jSONObject.put("msg", jSONObject2);
        jSONObject.put("current-gap_ms", A012);
        long j = 0;
        int i = 56;
        int i2 = 0;
        do {
            j += ((long) (A00(byteBuffer) & 255)) << i;
            i -= 8;
            i2++;
        } while (i2 < 8);
        jSONObject.put("unix_start_time_ms", j);
        jSONObject.put("finished", z);
        byte A002 = A00(byteBuffer);
        if (A002 == 1) {
            str = "fg";
        } else {
            if (A002 == 2) {
                str = "bg";
            }
            return jSONObject;
        }
        jSONObject.put("app_starting_status", str);
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(X.AnonymousClass0O4 r19, java.nio.ByteBuffer r20, org.json.JSONObject r21) {
        /*
            r18 = this;
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r6 = r20
            r7 = r18
            short r17 = r7.A04(r6)
            r4 = 0
        L_0x000e:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            int r1 = r7.A01(r6)
            java.lang.String r0 = "when"
            r8.put(r0, r1)
            int r1 = r7.A01(r6)
            java.lang.String r0 = "duration"
            r8.put(r0, r1)
            byte r2 = r7.A00(r6)
            java.lang.String r1 = "app_status"
            r0 = 1
            if (r2 != r0) goto L_0x00f7
            java.lang.String r0 = "fg"
        L_0x0030:
            r8.put(r1, r0)
        L_0x0033:
            short r0 = r7.A04(r6)
            r10 = r19
            java.lang.String r1 = r10.A01(r0)
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "thread_state"
            r8.put(r0, r1)
        L_0x004a:
            byte r3 = r7.A00(r6)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r9 = 0
            r1 = 0
        L_0x0055:
            short r0 = r7.A04(r6)
            java.lang.String r0 = r10.A01(r0)
            if (r1 >= r3) goto L_0x0064
            if (r0 == 0) goto L_0x0064
            r2.put(r0)
        L_0x0064:
            int r1 = r1 + 1
            r0 = 24
            if (r1 < r0) goto L_0x0055
            java.lang.String r0 = "stack_trace"
            r8.put(r0, r2)
            java.lang.String[] r12 = X.C02680Ck.A01
            int r11 = r12.length
            r3 = 0
        L_0x0073:
            if (r3 >= r11) goto L_0x008d
            r2 = r12[r3]
            short r0 = r7.A04(r6)
            java.lang.String r1 = r10.A01(r0)
            if (r1 == 0) goto L_0x008a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008a
            r8.put(r2, r1)
        L_0x008a:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x008d:
            java.lang.String[] r14 = X.C02680Ck.A00
            int r13 = r14.length
            r12 = 0
        L_0x0091:
            if (r12 >= r13) goto L_0x00b8
            r11 = r14[r12]
            r2 = 0
            r16 = 56
            r15 = 0
        L_0x009a:
            byte r0 = r7.A00(r6)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r16
            long r2 = r2 + r0
            int r16 = r16 + -8
            int r15 = r15 + 1
            r0 = 8
            if (r15 < r0) goto L_0x009a
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            r8.put(r11, r2)
        L_0x00b5:
            int r12 = r12 + 1
            goto L_0x0091
        L_0x00b8:
            byte r2 = r7.A00(r6)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x00c1:
            short r0 = r7.A04(r6)
            java.lang.String r0 = r10.A01(r0)
            if (r9 >= r2) goto L_0x00d0
            if (r0 == 0) goto L_0x00d0
            r1.put(r0)
        L_0x00d0:
            int r9 = r9 + 1
            r0 = 16
            if (r9 < r0) goto L_0x00c1
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00e1
            java.lang.String r0 = "render_thread_native_stack_trace"
            r8.put(r0, r1)
        L_0x00e1:
            r0 = r17
            if (r4 >= r0) goto L_0x00e8
            r5.put(r8)
        L_0x00e8:
            int r4 = r4 + 1
            r0 = 5
            if (r4 < r0) goto L_0x000e
            r1 = r21
            if (r21 == 0) goto L_0x00f6
            java.lang.String r0 = "exec_record"
            r1.put(r0, r5)
        L_0x00f6:
            return
        L_0x00f7:
            r0 = 2
            if (r2 != r0) goto L_0x0033
            java.lang.String r0 = "bg"
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05970Xd.A05(X.0O4, java.nio.ByteBuffer, org.json.JSONObject):void");
    }

    public final void CWp(C04170Mn r20, AnonymousClass0ND r21) {
        AnonymousClass0N1 r1;
        int i;
        String str;
        String str2;
        int i2;
        File file = this.A0A;
        if (file != null) {
            File file2 = new File(file, "looper.bin");
            if (file2.exists()) {
                AnonymousClass0O4 r7 = new AnonymousClass0O4(file, true);
                long length = file2.length();
                int i3 = 44;
                if (length <= 32767) {
                    i3 = 42;
                }
                this.A04 = i3;
                try {
                    FileChannel channel = new RandomAccessFile(file2, "r").getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate(this.A04);
                    channel.read(allocate);
                    allocate.position(0);
                    byte b = allocate.get();
                    this.A02 = b;
                    if (b == 11) {
                        allocate.get();
                        if (length <= 32767) {
                            i = allocate.getShort();
                        } else {
                            i = allocate.getInt();
                        }
                        this.A08 = allocate.getLong();
                        int i4 = allocate.getInt();
                        this.A05 = i4;
                        if (((long) i4) != length || i < this.A04 || i >= i4) {
                            StringBuilder sb = new StringBuilder("Exception reading header - ReadPos:");
                            sb.append(i);
                            sb.append(" HeaderSize:");
                            sb.append(this.A04);
                            sb.append(" size:");
                            sb.append(i4);
                            sb.append(" fileLength:");
                            sb.append(length);
                            r1 = new AnonymousClass0N1(sb.toString());
                        } else {
                            this.A06 = allocate.getInt();
                            this.A03 = allocate.getInt();
                            this.A07 = allocate.getLong();
                            this.A00 = allocate.get();
                            this.A09 = allocate.getLong();
                            this.A01 = allocate.get();
                            ByteBuffer allocate2 = ByteBuffer.allocate(this.A05);
                            allocate2.position(this.A04);
                            channel.read(allocate2);
                            allocate2.position(this.A04);
                            AnonymousClass0ON r18 = AnonymousClass0MU.A7r;
                            JSONObject jSONObject = new JSONObject();
                            ArrayList arrayList = new ArrayList();
                            allocate2.position(i);
                            JSONObject jSONObject2 = null;
                            int i5 = 0;
                            do {
                                try {
                                    byte A002 = A00(allocate2);
                                    int i6 = i5 + 1;
                                    if (A002 == 0) {
                                        break;
                                    }
                                    int position = allocate2.position();
                                    if (A002 == 1) {
                                        jSONObject2 = A03(r7, allocate2, true);
                                        A06(allocate2, jSONObject2, false);
                                    } else if (A002 == 5) {
                                        jSONObject2 = A03(r7, allocate2, true);
                                        A06(allocate2, jSONObject2, false);
                                        A05(r7, allocate2, jSONObject2);
                                    } else if (A002 == 2) {
                                        jSONObject2 = A03(r7, allocate2, false);
                                    } else {
                                        if (A002 != 3) {
                                            if (A002 != 4) {
                                                if (A002 != 7) {
                                                    if (A002 != 6) {
                                                        break;
                                                    }
                                                    A06(allocate2, jSONObject2, true);
                                                    A05(r7, allocate2, jSONObject2);
                                                } else {
                                                    A06(allocate2, jSONObject2, true);
                                                }
                                            } else {
                                                A06(allocate2, jSONObject2, false);
                                                A05(r7, allocate2, jSONObject2);
                                            }
                                        } else {
                                            A06(allocate2, jSONObject2, false);
                                        }
                                        jSONObject2 = null;
                                    }
                                    int position2 = allocate2.position();
                                    if (position2 > position) {
                                        i2 = position2 - position;
                                    } else {
                                        i6 += this.A05 - position;
                                        i2 = position2 - this.A04;
                                    }
                                    i5 = i6 + i2;
                                    if (jSONObject2 != null) {
                                        arrayList.add(0, jSONObject2);
                                    }
                                    if (allocate2.position() == i) {
                                        break;
                                    }
                                } catch (JSONException e) {
                                    C04790Pd.A00();
                                    r1 = new AnonymousClass0N1(AnonymousClass00U.A0L("Exception creating JSON looper history:", A02(e)), e);
                                } catch (BufferUnderflowException e2) {
                                    C04790Pd.A00();
                                    r1 = new AnonymousClass0N1(AnonymousClass00U.A0L("Exception reading history buffer:", A02(e2)), e2);
                                } catch (Exception e3) {
                                    C04790Pd.A00();
                                    r1 = new AnonymousClass0N1(AnonymousClass00U.A0L("Exception getting looper history:", A02(e3)), e3);
                                }
                            } while (i5 > this.A05);
                            long j = this.A08;
                            if (!arrayList.isEmpty()) {
                                JSONObject jSONObject3 = (JSONObject) arrayList.get(0);
                                long j2 = (long) jSONObject3.getInt("current-gap_ms");
                                if (jSONObject3.has("duration_ms")) {
                                    j2 += (long) jSONObject3.getInt("duration_ms");
                                }
                                j = this.A08 + j2;
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    JSONObject jSONObject4 = (JSONObject) it.next();
                                    boolean z = jSONObject4.getBoolean("finished");
                                    long j3 = j2 - ((long) jSONObject4.getInt("current-gap_ms"));
                                    if (z) {
                                        jSONObject4.put("current-from_ms_ago", j3);
                                    } else {
                                        jSONObject4.put("current-running_ms", j3);
                                        jSONObject4.remove("duration_ms");
                                        jSONObject4.remove("duration_cpu_ms");
                                    }
                                    jSONObject4.remove("current-gap_ms");
                                    jSONObject4.remove("finished");
                                }
                            }
                            jSONObject.put(ClientCookie.VERSION_ATTR, this.A02 & 255);
                            jSONObject.put("current_uptime_ms", j);
                            jSONObject.put("config_duration", this.A05);
                            jSONObject.put("config_threshold_ms", this.A06);
                            int i7 = this.A03;
                            if (i7 > 0) {
                                jSONObject.put("exec_monitor_threshold_ms", i7);
                            }
                            jSONObject.put("app_status_change_unix_time_ms", this.A07);
                            byte b2 = this.A00;
                            if (b2 == 1) {
                                str = "fg";
                            } else if (b2 == 2) {
                                str = "bg";
                            } else {
                                str = "unknown";
                            }
                            jSONObject.put("app_status", str);
                            jSONObject.put("prev_app_status_change_unix_time_ms", this.A09);
                            byte b3 = this.A01;
                            if (b3 == 1) {
                                str2 = "fg";
                            } else if (b3 == 2) {
                                str2 = "bg";
                            } else {
                                str2 = "unknown";
                            }
                            jSONObject.put("prev_app_status", str2);
                            jSONObject.put("history", new JSONArray(arrayList));
                            r20.A03(r18, jSONObject.toString());
                            return;
                        }
                    } else {
                        r1 = new AnonymousClass0N1(AnonymousClass00U.A01(b, 11, "Exception reading header - bufferVersion:", " collectorVersion:"));
                    }
                    throw r1;
                } catch (FileNotFoundException e4) {
                    C04790Pd.A00();
                    throw new AnonymousClass0N1(AnonymousClass00U.A0L("File not found:", A02(e4)), e4);
                } catch (IllegalArgumentException e5) {
                    C04790Pd.A00();
                    throw new AnonymousClass0N1(AnonymousClass00U.A0L("Exception creating header:", A02(e5)), e5);
                } catch (BufferUnderflowException e6) {
                    C04790Pd.A00();
                    throw new AnonymousClass0N1(AnonymousClass00U.A0L("Exception reading header:", A02(e6)), e6);
                } catch (IOException e7) {
                    C04790Pd.A00();
                    throw new AnonymousClass0N1(AnonymousClass00U.A0L("Exception accessing file:", A02(e7)), e7);
                }
            }
        }
    }

    public C05970Xd(File file) {
        this.A0A = file;
    }

    private byte A00(ByteBuffer byteBuffer) {
        if (byteBuffer.position() >= this.A05) {
            byteBuffer.position(this.A04);
        }
        return byteBuffer.get();
    }

    public static String A02(Exception exc) {
        try {
            String A012 = AnonymousClass0MN.A01(exc);
            if (TextUtils.isEmpty(A012.trim())) {
                return "No stack trace";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(exc);
            sb.append(AnonymousClass0MN.A00(A012, 1000));
            return sb.toString();
        } catch (Throwable unused) {
            C04790Pd.A00();
            return AnonymousClass00U.A0L(exc.getMessage(), ": truncated trace");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(java.nio.ByteBuffer r6, org.json.JSONObject r7, boolean r8) {
        /*
            r5 = this;
            int r2 = r5.A01(r6)
            int r1 = r5.A01(r6)
            if (r7 == 0) goto L_0x002e
            java.lang.String r0 = "duration_ms"
            r7.put(r0, r2)
            java.lang.String r0 = "duration_cpu_ms"
            r7.put(r0, r1)
            byte r4 = r5.A00(r6)
            java.lang.String r3 = "app_in_progress_status"
            java.lang.String r2 = "app_finishing_status"
            r1 = 1
            if (r4 != r1) goto L_0x002f
            if (r8 != 0) goto L_0x0022
            r3 = r2
        L_0x0022:
            java.lang.String r0 = "fg"
        L_0x0024:
            r7.put(r3, r0)
        L_0x0027:
            if (r8 != 0) goto L_0x002e
            java.lang.String r0 = "finished"
            r7.put(r0, r1)
        L_0x002e:
            return
        L_0x002f:
            r0 = 2
            if (r4 != r0) goto L_0x0027
            if (r8 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            java.lang.String r0 = "bg"
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05970Xd.A06(java.nio.ByteBuffer, org.json.JSONObject, boolean):void");
    }

    public final Integer Awy() {
        return AnonymousClass006.A14;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
