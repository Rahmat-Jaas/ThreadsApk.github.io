package X;

import android.view.View;
import com.instagram.barcelona.R;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/* renamed from: X.7Jk  reason: invalid class name and case insensitive filesystem */
public final class C122007Jk {
    public static C122007Jk A05;
    public static Method A06;
    public static Method A07;
    public Method A00;
    public Method A01;
    public final C107086g7 A02 = new C107086g7();
    public final C109706kR A03 = new C109706kR();
    public final C104606c3 A04 = new C104606c3(this);

    private boolean A03(View view, C104606c3 r17, PrintWriter printWriter, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        try {
            Method method = this.A01;
            if (method == null) {
                Class<?> cls = Class.forName("com.facebook.compose.dumpsys.ComposeDumpHelper");
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                method = cls.getMethod("dump", new Class[]{PrintWriter.class, View.class, String.class, cls2, cls2, cls3, cls3, cls3, C104606c3.class});
                this.A01 = method;
            }
            PrintWriter printWriter2 = printWriter;
            Object invoke = method.invoke((Object) null, new Object[]{printWriter2, view, str, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), r17});
            if (invoke instanceof Boolean) {
                return AnonymousClass0wJ.A1X(invoke);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean A05(String[] strArr, String str) {
        for (String equalsIgnoreCase : strArr) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public static String A00(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() < 1) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() > i) {
            return AnonymousClass00U.A0L(replace.substring(0, i), "...");
        }
        return replace;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (A05(r2, X.C18170wI.A00(520)) == false) goto L_0x0071;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x019c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.io.PrintWriter r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r16 = 0
            r2 = r21
            if (r21 == 0) goto L_0x01b3
            int r0 = r2.length
            if (r0 <= 0) goto L_0x01b3
            r1 = r21[r16]
            java.lang.String r0 = "e2e"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b3
            X.7Jk r12 = A05
            if (r12 != 0) goto L_0x001e
            X.7Jk r12 = new X.7Jk
            r12.<init>()
            A05 = r12
        L_0x001e:
            java.lang.String r0 = "JEST_E2E_DUMPSYS_HELPER"
            r14 = r19
            r14.println(r0)
            java.lang.String r1 = X.AnonymousClass0MI.A00()
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "ENDPOINT "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            r14.println(r0)
        L_0x0034:
            r9 = r20
            r14.print(r9)
            java.lang.String r0 = "Top Level Window View Hierarchy:"
            r14.println(r0)
            java.lang.String r0 = "all-roots"
            boolean r11 = A05(r2, r0)
            java.lang.String r0 = "top-root"
            boolean r10 = A05(r2, r0)
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r0 = X.I17.A00(r0)
            boolean r18 = A05(r2, r0)
            java.lang.String r0 = "jpc"
            boolean r21 = A05(r2, r0)
            java.lang.String r0 = "props"
            boolean r19 = A05(r2, r0)
            r0 = 1
            if (r19 == 0) goto L_0x0071
            r1 = 520(0x208, float:7.29E-43)
            java.lang.String r1 = X.C18170wI.A00(r1)
            boolean r1 = A05(r2, r1)
            r20 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0071:
            r20 = 0
        L_0x0073:
            X.6kR r4 = r12.A03     // Catch:{ Exception -> 0x01a7 }
            boolean r1 = r4.A03     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x00a8
            java.lang.String r3 = "mParams"
            java.lang.String r5 = "mViews"
            r4.A03 = r0     // Catch:{ Exception -> 0x01a7 }
            r1 = 766(0x2fe, float:1.073E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "getInstance"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            java.lang.Object r1 = X.C86104wH.A0p(r1, r2)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            r4.A00 = r1     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            java.lang.reflect.Field r1 = r2.getDeclaredField(r5)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            r4.A02 = r1     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            r1.setAccessible(r0)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            java.lang.reflect.Field r1 = r2.getDeclaredField(r3)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            r4.A01 = r1     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            r1.setAccessible(r0)     // Catch:{ InvocationTargetException -> 0x00a4, ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException -> 0x00a8 }
            goto L_0x00a8
        L_0x00a4:
            r1 = move-exception
            r1.getCause()     // Catch:{ Exception -> 0x01a7 }
        L_0x00a8:
            java.lang.Object r3 = r4.A00     // Catch:{ Exception -> 0x01a7 }
            if (r3 == 0) goto L_0x01b1
            java.lang.reflect.Field r2 = r4.A02     // Catch:{ Exception -> 0x01a7 }
            if (r2 == 0) goto L_0x01b1
            java.lang.reflect.Field r1 = r4.A01     // Catch:{ Exception -> 0x01a7 }
            if (r1 == 0) goto L_0x01b1
            r8 = 0
            java.lang.Object r7 = r2.get(r3)     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.lang.reflect.Field r2 = r4.A01     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.lang.Object r1 = r4.A00     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.lang.Object r6 = r2.get(r1)     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ IllegalAccessException | RuntimeException -> 0x01b1 }
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x01a7 }
            int r4 = r7.size()     // Catch:{ Exception -> 0x01a7 }
        L_0x00cd:
            if (r8 >= r4) goto L_0x00e6
            java.lang.Object r3 = r7.get(r8)     // Catch:{ Exception -> 0x01a7 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x01a7 }
            java.lang.Object r2 = r6.get(r8)     // Catch:{ Exception -> 0x01a7 }
            android.view.WindowManager$LayoutParams r2 = (android.view.WindowManager.LayoutParams) r2     // Catch:{ Exception -> 0x01a7 }
            X.6g9 r1 = new X.6g9     // Catch:{ Exception -> 0x01a7 }
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x01a7 }
            r5.add(r1)     // Catch:{ Exception -> 0x01a7 }
            int r8 = r8 + 1
            goto L_0x00cd
        L_0x00e6:
            boolean r1 = r5.isEmpty()     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x01b1
            java.util.Collections.reverse(r5)     // Catch:{ Exception -> 0x01a7 }
            r4 = 0
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01a7 }
        L_0x00f4:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x01a7 }
            if (r1 == 0) goto L_0x0119
            java.lang.Object r3 = r5.next()     // Catch:{ Exception -> 0x01a7 }
            X.6g9 r3 = (X.C107106g9) r3     // Catch:{ Exception -> 0x01a7 }
            android.view.View r13 = r3.A00     // Catch:{ Exception -> 0x01a7 }
            int r1 = r13.getVisibility()     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x00f4
            if (r11 != 0) goto L_0x011c
            if (r4 == 0) goto L_0x011c
            android.view.WindowManager$LayoutParams r1 = r3.A01     // Catch:{ Exception -> 0x01a7 }
            int r2 = r1.type     // Catch:{ Exception -> 0x01a7 }
            int r1 = r4.type     // Catch:{ Exception -> 0x01a7 }
            int r2 = r2 - r1
            int r1 = java.lang.Math.abs(r2)     // Catch:{ Exception -> 0x01a7 }
            if (r1 == r0) goto L_0x011c
        L_0x0119:
            X.6g7 r3 = r12.A02     // Catch:{ Exception -> 0x01a7 }
            goto L_0x012c
        L_0x011c:
            java.lang.String r1 = "  "
            java.lang.String r15 = X.AnonymousClass00U.A0L(r9, r1)     // Catch:{ Exception -> 0x01a7 }
            r17 = r16
            r12.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01a7 }
            android.view.WindowManager$LayoutParams r4 = r3.A01     // Catch:{ Exception -> 0x01a7 }
            if (r10 == 0) goto L_0x00f4
            goto L_0x0119
        L_0x012c:
            java.util.Set r1 = r3.A01     // Catch:{ Exception -> 0x019c }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x019c }
        L_0x0132:
            boolean r1 = r6.hasNext()     // Catch:{ Exception -> 0x019c }
            if (r1 == 0) goto L_0x019c
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x019c }
            X.76k r5 = (X.C1196776k) r5     // Catch:{ Exception -> 0x019c }
            java.util.Map r1 = r3.A00     // Catch:{ Exception -> 0x019c }
            java.lang.String r7 = r5.A04     // Catch:{ Exception -> 0x019c }
            java.lang.String r4 = X.C18220wO.A0r(r7, r1)     // Catch:{ Exception -> 0x019c }
            if (r4 == 0) goto L_0x0132
            java.lang.String r1 = "WebView HTML for "
            r14.print(r1)     // Catch:{ Exception -> 0x019c }
            r14.print(r5)     // Catch:{ Exception -> 0x019c }
            java.lang.String r1 = ":"
            r14.println(r1)     // Catch:{ Exception -> 0x019c }
            java.lang.String r2 = "\\u003C"
            java.lang.String r1 = "<"
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x019c }
            java.lang.String r2 = "\\n"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x019c }
            java.lang.String r2 = "\\\""
            java.lang.String r1 = "\""
            java.lang.String r2 = r4.replace(r2, r1)     // Catch:{ Exception -> 0x019c }
            int r1 = r5.A01     // Catch:{ Exception -> 0x019c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x019c }
            int r1 = r5.A02     // Catch:{ Exception -> 0x019c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x019c }
            int r1 = r5.A03     // Catch:{ Exception -> 0x019c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x019c }
            int r1 = r5.A00     // Catch:{ Exception -> 0x019c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x019c }
            int r1 = r2.length()     // Catch:{ Exception -> 0x019c }
            int r1 = r1 - r0
            java.lang.String r12 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x019c }
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r8, r9, r10, r11, r12}     // Catch:{ Exception -> 0x019c }
            java.lang.String r1 = "<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>"
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Exception -> 0x019c }
            r14.println(r1)     // Catch:{ Exception -> 0x019c }
            goto L_0x0132
        L_0x019c:
            java.util.Set r0 = r3.A01     // Catch:{ Exception -> 0x01a7 }
            r0.clear()     // Catch:{ Exception -> 0x01a7 }
            java.util.Map r0 = r3.A00     // Catch:{ Exception -> 0x01a7 }
            r0.clear()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01b1
        L_0x01a7:
            r1 = move-exception
            java.lang.String r0 = "Failure in view hierarchy dump: "
            java.lang.String r0 = X.C18230wP.A0t(r0, r1)
            r14.println(r0)
        L_0x01b1:
            r0 = 1
            return r0
        L_0x01b3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122007Jk.A04(java.io.PrintWriter, java.lang.String, java.lang.String[]):boolean");
    }

    public static void A01(View view, PrintWriter printWriter) {
        Object tag = view.getTag(R.id.testing_id_view_tag_key);
        if (tag == null) {
            tag = view.getTag();
        }
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(str.replace(' ', '_'));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x051a, code lost:
        if (r1 != false) goto L_0x051c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0562 A[Catch:{ Exception -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x050d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05d1 A[EDGE_INSN: B:239:0x05d1->B:219:0x05d1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0184 A[Catch:{ Exception -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0195 A[Catch:{ Exception -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ad A[Catch:{ Exception -> 0x021d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.view.View r32, java.io.PrintWriter r33, java.lang.String r34, int r35, int r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r31 = this;
            r4 = r33
            r30 = r34
            r0 = r30
            r4.print(r0)
            r5 = r32
            if (r32 != 0) goto L_0x0013
            java.lang.String r0 = "null"
            r4.println(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Class r19 = r5.getClass()
            java.lang.String r0 = r19.getName()
            r4.print(r0)
            java.lang.String r0 = "{"
            r4.print(r0)
            int r0 = r5.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r4.print(r0)
            java.lang.String r8 = " "
            r4.print(r8)
            int r2 = r5.getVisibility()
            java.lang.String r7 = "V"
            java.lang.String r1 = "."
            if (r2 == 0) goto L_0x0124
            r0 = 4
            if (r2 == r0) goto L_0x011a
            r0 = 8
            if (r2 == r0) goto L_0x011d
            r4.print(r1)
        L_0x0047:
            boolean r2 = r5.isFocusable()
            java.lang.String r6 = "F"
            r0 = r1
            if (r2 == 0) goto L_0x0051
            r0 = r6
        L_0x0051:
            r4.print(r0)
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "E"
        L_0x005c:
            r4.print(r0)
            r4.print(r1)
            boolean r3 = r5.isHorizontalScrollBarEnabled()
            java.lang.String r2 = "H"
            r0 = r1
            if (r3 == 0) goto L_0x006c
            r0 = r2
        L_0x006c:
            r4.print(r0)
            boolean r0 = r5.isVerticalScrollBarEnabled()
            if (r0 != 0) goto L_0x0076
            r7 = r1
        L_0x0076:
            r4.print(r7)
            boolean r0 = r5.isClickable()
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "C"
        L_0x0081:
            r4.print(r0)
            boolean r0 = r5.isLongClickable()
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "L"
        L_0x008c:
            r4.print(r0)
            r4.print(r8)
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L_0x0099
            r6 = r1
        L_0x0099:
            r4.print(r6)
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "S"
        L_0x00a4:
            r4.print(r0)
            boolean r0 = r5.isHovered()
            if (r0 != 0) goto L_0x00ae
            r2 = r1
        L_0x00ae:
            r4.print(r2)
            boolean r0 = r5.isActivated()
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "A"
        L_0x00b9:
            r4.print(r0)
            boolean r0 = r5.isDirty()
            if (r0 == 0) goto L_0x00c4
            java.lang.String r1 = "D"
        L_0x00c4:
            r4.print(r1)
            r18 = 2
            r0 = r18
            int[] r7 = new int[r0]
            r5.getLocationOnScreen(r7)
            r4.print(r8)
            r3 = 0
            r0 = r7[r3]
            r24 = r35
            int r0 = r0 - r35
            r4.print(r0)
            java.lang.String r6 = ","
            r4.print(r6)
            r2 = 1
            r0 = r7[r2]
            r25 = r36
            int r0 = r0 - r36
            r4.print(r0)
            java.lang.String r0 = "-"
            r4.print(r0)
            r1 = r7[r3]
            int r0 = r5.getWidth()
            int r1 = r1 + r0
            int r1 = r1 - r35
            r4.print(r1)
            r4.print(r6)
            r1 = r7[r2]
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            int r1 = r1 - r36
            r4.print(r1)
            goto L_0x0129
        L_0x010d:
            r0 = r1
            goto L_0x00b9
        L_0x010f:
            r0 = r1
            goto L_0x00a4
        L_0x0111:
            r0 = r1
            goto L_0x008c
        L_0x0114:
            r0 = r1
            goto L_0x0081
        L_0x0117:
            r0 = r1
            goto L_0x005c
        L_0x011a:
            java.lang.String r0 = "I"
            goto L_0x011f
        L_0x011d:
            java.lang.String r0 = "G"
        L_0x011f:
            r4.print(r0)
            goto L_0x0047
        L_0x0124:
            r4.print(r7)
            goto L_0x0047
        L_0x0129:
            int r6 = r5.getId()     // Catch:{ Exception -> 0x017c }
            r0 = -1
            if (r6 == r0) goto L_0x0178
            java.lang.String r0 = " #"
            r4.append(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = java.lang.Integer.toHexString(r6)     // Catch:{ Exception -> 0x017c }
            r4.append(r0)     // Catch:{ Exception -> 0x017c }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ Exception -> 0x017c }
            if (r6 <= 0) goto L_0x0178
            if (r1 == 0) goto L_0x0178
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r7 & r6
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == r0) goto L_0x0154
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r7 == r0) goto L_0x0157
            java.lang.String r0 = r1.getResourcePackageName(r6)     // Catch:{ Exception -> 0x017c }
            goto L_0x0159
        L_0x0154:
            java.lang.String r0 = "android"
            goto L_0x0159
        L_0x0157:
            java.lang.String r0 = "app"
        L_0x0159:
            r4.print(r8)     // Catch:{ Exception -> 0x017c }
            r4.print(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = ":"
            r4.print(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = r1.getResourceTypeName(r6)     // Catch:{ Exception -> 0x017c }
            r4.print(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = "/"
            r4.print(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = r1.getResourceEntryName(r6)     // Catch:{ Exception -> 0x017c }
            r4.print(r0)     // Catch:{ Exception -> 0x017c }
            goto L_0x017f
        L_0x0178:
            A01(r5, r4)     // Catch:{ Exception -> 0x017c }
            goto L_0x017f
        L_0x017c:
            A01(r5, r4)
        L_0x017f:
            r1 = 0
            boolean r0 = r5 instanceof android.widget.TextView     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x01ad
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021d }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x021d }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x021d }
        L_0x018f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x021d }
            if (r0 != 0) goto L_0x021d
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x021d }
            r4.print(r0)     // Catch:{ Exception -> 0x021d }
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r0 = A00(r1, r0)     // Catch:{ Exception -> 0x021d }
            r4.print(r0)     // Catch:{ Exception -> 0x021d }
            java.lang.String r0 = "\""
            r4.print(r0)     // Catch:{ Exception -> 0x021d }
            goto L_0x021d
        L_0x01ad:
            java.lang.String r6 = r19.getSimpleName()     // Catch:{ Exception -> 0x021d }
            java.lang.String r0 = "RCTextView"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x01d6
            java.lang.reflect.Method r1 = A07     // Catch:{ Exception -> 0x021d }
            if (r1 != 0) goto L_0x01c9
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x021d }
            java.lang.String r1 = "getText"
            r0 = r19
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r6)     // Catch:{ Exception -> 0x021d }
            A07 = r1     // Catch:{ Exception -> 0x021d }
        L_0x01c9:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x021d }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x021d }
            goto L_0x018f
        L_0x01d6:
            java.lang.String r0 = "GlyphView"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x01fd
            java.lang.reflect.Method r1 = A06     // Catch:{ Exception -> 0x021d }
            if (r1 != 0) goto L_0x01ee
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x021d }
            java.lang.String r1 = "getText"
            r0 = r19
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r6)     // Catch:{ Exception -> 0x021d }
            A06 = r1     // Catch:{ Exception -> 0x021d }
        L_0x01ee:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x021d }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x021d }
            goto L_0x018f
        L_0x01fb:
            r1 = 0
            goto L_0x018f
        L_0x01fd:
            java.lang.CharSequence r0 = r5.getContentDescription()     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x0207
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x021d }
        L_0x0207:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r5.getTag()     // Catch:{ Exception -> 0x021d }
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x021d }
            java.lang.String r1 = r0.trim()     // Catch:{ Exception -> 0x021d }
            goto L_0x018f
        L_0x021d:
            r27 = r38
            if (r38 == 0) goto L_0x04f6
            android.view.accessibility.AccessibilityNodeInfo r10 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            r5.onInitializeAccessibilityNodeInfo(r10)     // Catch:{ NullPointerException -> 0x04f1 }
            if (r10 == 0) goto L_0x04f6
            org.json.JSONObject r9 = X.C18230wP.A0y()
            r8 = 50
            boolean r0 = r5 instanceof android.widget.TextView     // Catch:{ Exception -> 0x04c7 }
            if (r0 == 0) goto L_0x025d
            r7 = r5
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "textColor"
            android.content.res.ColorStateList r0 = r7.getTextColors()     // Catch:{ Exception -> 0x04c7 }
            int r0 = r0.getDefaultColor()     // Catch:{ Exception -> 0x04c7 }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r6 = "textSize"
            float r0 = r7.getTextSize()     // Catch:{ Exception -> 0x04c7 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x04c7 }
            r9.put(r6, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r6 = "hint"
            java.lang.CharSequence r1 = r7.getHint()     // Catch:{ Exception -> 0x04c7 }
            r0 = 100
            java.lang.String r0 = A00(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            r9.put(r6, r0)     // Catch:{ Exception -> 0x04c7 }
        L_0x025d:
            java.lang.reflect.Field r0 = X.AnonymousClass733.A00     // Catch:{ Exception -> 0x0301 }
            if (r0 != 0) goto L_0x026e
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r0 = "mKeyedTags"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0301 }
            X.AnonymousClass733.A00 = r0     // Catch:{ Exception -> 0x0301 }
            r0.setAccessible(r2)     // Catch:{ Exception -> 0x0301 }
        L_0x026e:
            java.lang.reflect.Field r0 = X.AnonymousClass733.A00     // Catch:{ Exception -> 0x0301 }
            java.lang.Object r12 = r0.get(r5)     // Catch:{ Exception -> 0x0301 }
            android.util.SparseArray r12 = (android.util.SparseArray) r12     // Catch:{ Exception -> 0x0301 }
            if (r12 == 0) goto L_0x0301
            int r0 = r12.size()     // Catch:{ Exception -> 0x0301 }
            if (r0 <= 0) goto L_0x0301
            org.json.JSONObject r17 = X.C18230wP.A0y()     // Catch:{ Exception -> 0x0301 }
            r11 = 0
            int r16 = r12.size()     // Catch:{ Exception -> 0x02fa }
        L_0x0287:
            r0 = r16
            if (r11 >= r0) goto L_0x02fa
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ Exception -> 0x02fa }
            int r7 = r12.keyAt(r11)     // Catch:{ Exception -> 0x02fa }
            if (r0 != 0) goto L_0x02a0
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r7)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r6 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ NotFoundException -> 0x02e4 }
            goto L_0x02ee
        L_0x02a0:
            int r1 = r7 >>> 24
            r6 = r1 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            java.lang.String r15 = ""
            if (r6 == r1) goto L_0x02e2
            java.lang.String r15 = r0.getResourcePackageName(r7)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r14 = ":"
        L_0x02b0:
            java.lang.String r13 = r0.getResourceTypeName(r7)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r6 = r0.getResourceEntryName(r7)     // Catch:{ NotFoundException -> 0x02e4 }
            int r0 = r15.length()     // Catch:{ NotFoundException -> 0x02e4 }
            int r0 = r0 + 1
            int r0 = X.C86154wM.A06(r14, r0)     // Catch:{ NotFoundException -> 0x02e4 }
            int r0 = X.C86154wM.A06(r13, r0)     // Catch:{ NotFoundException -> 0x02e4 }
            int r0 = r0 + 1
            int r0 = X.C86154wM.A06(r6, r0)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r0 = "@"
            X.C18230wP.A1S(r0, r15, r14, r1)     // Catch:{ NotFoundException -> 0x02e4 }
            r1.append(r13)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ NotFoundException -> 0x02e4 }
            java.lang.String r6 = X.C18180wK.A0i(r6, r1)     // Catch:{ NotFoundException -> 0x02e4 }
            goto L_0x02ee
        L_0x02e2:
            r14 = r15
            goto L_0x02b0
        L_0x02e4:
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r7)     // Catch:{ Exception -> 0x02fa }
            java.lang.String r6 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ Exception -> 0x02fa }
        L_0x02ee:
            java.lang.Object r1 = r12.valueAt(r11)     // Catch:{ JSONException -> 0x02f7 }
            r0 = r17
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x02f7 }
        L_0x02f7:
            int r11 = r11 + 1
            goto L_0x0287
        L_0x02fa:
            java.lang.String r1 = "keyedTags"
            r0 = r17
            r9.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
        L_0x0301:
            org.json.JSONArray r1 = X.C18250wR.A0i()     // Catch:{ Exception -> 0x04c7 }
            java.util.List r0 = r10.getActionList()     // Catch:{ Exception -> 0x04c7 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x04c7 }
        L_0x030d:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x04c7 }
            if (r0 == 0) goto L_0x0329
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x04c7 }
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0     // Catch:{ Exception -> 0x04c7 }
            java.lang.CharSequence r0 = r0.getLabel()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04c7 }
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = A00(r0, r8)     // Catch:{ Exception -> 0x04c7 }
            r1.put(r0)     // Catch:{ Exception -> 0x04c7 }
            goto L_0x030d
        L_0x0329:
            int r0 = r1.length()     // Catch:{ Exception -> 0x04c7 }
            if (r0 <= 0) goto L_0x0334
            java.lang.String r0 = "actions"
            r9.put(r0, r1)     // Catch:{ Exception -> 0x04c7 }
        L_0x0334:
            java.lang.CharSequence r0 = r10.getContentDescription()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = A00(r0, r8)     // Catch:{ Exception -> 0x04c7 }
            if (r1 == 0) goto L_0x0349
            int r0 = r1.length()     // Catch:{ Exception -> 0x04c7 }
            if (r0 <= 0) goto L_0x0349
            java.lang.String r0 = "content-description"
            r9.put(r0, r1)     // Catch:{ Exception -> 0x04c7 }
        L_0x0349:
            org.json.JSONObject r6 = X.C18230wP.A0y()     // Catch:{ Exception -> 0x04c7 }
            android.graphics.drawable.Drawable r12 = r5.getBackground()     // Catch:{ Exception -> 0x04c7 }
            boolean r0 = r12 instanceof android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r7 = "alpha"
            if (r0 == 0) goto L_0x037e
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12     // Catch:{ Exception -> 0x04c7 }
            int r0 = r12.getAlpha()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r11 = r6.put(r7, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "color"
            int r0 = r12.getColor()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r11 = r11.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "level"
            int r0 = r12.getLevel()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r11 = r11.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "opacity"
            int r0 = r12.getOpacity()     // Catch:{ Exception -> 0x04c7 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
        L_0x037e:
            java.lang.String r1 = "accessibility-focused"
            boolean r0 = r10.isAccessibilityFocused()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r1 = r9.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            float r0 = r5.getAlpha()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r1 = r1.put(r7, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = "background"
            org.json.JSONObject r6 = r1.put(r0, r6)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "checkable"
            boolean r0 = r10.isCheckable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "checked"
            boolean r0 = r10.isChecked()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "class-name"
            java.lang.CharSequence r0 = r10.getClassName()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = A00(r0, r8)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "clickable"
            boolean r0 = r10.isClickable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "content-invalid"
            boolean r0 = r10.isContentInvalid()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "dismissable"
            boolean r0 = r10.isDismissable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "editable"
            boolean r0 = r10.isEditable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "elevation"
            float r0 = r5.getElevation()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "enabled"
            boolean r0 = r10.isEnabled()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "focusable"
            boolean r0 = r10.isFocusable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "focused"
            boolean r0 = r10.isFocused()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "height"
            int r0 = r5.getHeight()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "is-layout-requested"
            boolean r0 = r5.isLayoutRequested()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "long-clickable"
            boolean r0 = r10.isLongClickable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "multiline"
            boolean r0 = r10.isMultiLine()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "measured-height"
            int r0 = r5.getMeasuredWidth()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "measured-width"
            int r0 = r5.getMeasuredHeight()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "password"
            boolean r0 = r10.isPassword()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "scrollable"
            boolean r0 = r10.isScrollable()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "selected"
            boolean r0 = r10.isSelected()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "translation-x"
            float r0 = r5.getTranslationX()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "translation-y"
            float r0 = r5.getTranslationY()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "visible-to-user"
            boolean r0 = r10.isVisibleToUser()     // Catch:{ Exception -> 0x04c7 }
            org.json.JSONObject r6 = r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r1 = "width"
            int r0 = r5.getWidth()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04c7 }
            r6.put(r1, r0)     // Catch:{ Exception -> 0x04c7 }
            boolean r1 = r10.isContextClickable()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = "context-clickable"
            org.json.JSONObject r6 = r9.put(r0, r1)     // Catch:{ Exception -> 0x04c7 }
            int r1 = r10.getDrawingOrder()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = "drawing-order"
            org.json.JSONObject r6 = r6.put(r0, r1)     // Catch:{ Exception -> 0x04c7 }
            boolean r1 = r10.isImportantForAccessibility()     // Catch:{ Exception -> 0x04c7 }
            java.lang.String r0 = "important-for-accessibility"
            r6.put(r0, r1)     // Catch:{ Exception -> 0x04c7 }
            goto L_0x04d9
        L_0x04c7:
            r6 = move-exception
            r0 = 642(0x282, float:9.0E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ JSONException -> 0x04d9 }
            java.lang.String r0 = r6.getMessage()     // Catch:{ JSONException -> 0x04d9 }
            java.lang.String r0 = A00(r0, r8)     // Catch:{ JSONException -> 0x04d9 }
            r9.put(r1, r0)     // Catch:{ JSONException -> 0x04d9 }
        L_0x04d9:
            r0 = 499(0x1f3, float:6.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.PrintWriter r1 = r4.append(r0)
            java.lang.String r0 = r9.toString()
            java.io.PrintWriter r1 = r1.append(r0)
            java.lang.String r0 = "\""
            r1.append(r0)
            goto L_0x04f6
        L_0x04f1:
            if (r10 == 0) goto L_0x04f6
            r10.recycle()
        L_0x04f6:
            java.lang.String r0 = "}"
            r4.println(r0)
            r6 = r19
        L_0x04fd:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "com.facebook.litho.LithoView"
            boolean r1 = r1.equals(r0)
            r0 = r31
            r28 = r39
            if (r1 == 0) goto L_0x051e
            java.lang.String r1 = "exclude_litho_props"
            java.lang.String r1 = com.facebook.endtoend.EndToEnd.A00(r1, r2, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r38 == 0) goto L_0x051c
            r11 = 1
            if (r1 == 0) goto L_0x0525
        L_0x051c:
            r11 = 0
            goto L_0x0525
        L_0x051e:
            java.lang.Class r6 = r6.getSuperclass()
            if (r6 == 0) goto L_0x0593
            goto L_0x04fd
        L_0x0525:
            java.lang.reflect.Method r1 = r0.A00     // Catch:{ Exception -> 0x0575 }
            if (r1 != 0) goto L_0x0547
            java.lang.String r1 = "com.facebook.litho.LithoViewTestHelper"
            java.lang.Class r10 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0575 }
            java.lang.String r1 = "com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription"
            java.lang.Class r9 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0575 }
            java.lang.String r8 = "viewToStringForE2E"
            java.lang.Class<android.view.View> r7 = android.view.View.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0575 }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0575 }
            java.lang.Class[] r1 = new java.lang.Class[]{r7, r6, r1, r9}     // Catch:{ Exception -> 0x0575 }
            java.lang.reflect.Method r1 = r10.getDeclaredMethod(r8, r1)     // Catch:{ Exception -> 0x0575 }
            r0.A00 = r1     // Catch:{ Exception -> 0x0575 }
        L_0x0547:
            if (r39 == 0) goto L_0x0550
            java.lang.String r1 = "com.facebook.analytics.adslogging.context.trackingnodedumper.LogContextTrackingNodeDumper"
            java.lang.Object r9 = X.C18230wP.A0g(r1)     // Catch:{ Exception -> 0x0550 }
            goto L_0x0551
        L_0x0550:
            r9 = 0
        L_0x0551:
            java.lang.reflect.Method r8 = r0.A00     // Catch:{ Exception -> 0x0575 }
            r7 = 0
            int r1 = r30.length()     // Catch:{ Exception -> 0x0575 }
            int r1 = r1 / r18
            int r1 = r1 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0575 }
            if (r9 == 0) goto L_0x0563
            r11 = 0
        L_0x0563:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x0575 }
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r1, r9}     // Catch:{ Exception -> 0x0575 }
            java.lang.Object r1 = r8.invoke(r7, r1)     // Catch:{ Exception -> 0x0575 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0575 }
            r4.append(r1)     // Catch:{ Exception -> 0x0575 }
            goto L_0x0593
        L_0x0575:
            r8 = move-exception
            r1 = r30
            java.io.PrintWriter r6 = r4.append(r1)
            java.lang.String r1 = "Failed litho view sub hierarch dump: "
            java.io.PrintWriter r7 = r6.append(r1)
            java.lang.String r6 = r8.getMessage()
            r1 = 100
            java.lang.String r1 = A00(r6, r1)
            java.io.PrintWriter r1 = r7.append(r1)
            r1.println()
        L_0x0593:
            java.lang.String r8 = "  "
            r26 = r37
            r29 = r40
            if (r40 == 0) goto L_0x05d1
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r6 < r1) goto L_0x05d1
            java.lang.Class[] r9 = r19.getInterfaces()
            int r10 = r9.length
            r7 = 0
        L_0x05a7:
            if (r7 >= r10) goto L_0x05d1
            r1 = r9[r7]
            java.lang.String r6 = r1.getName()
            java.lang.String r1 = "androidx.compose.ui.platform.ViewRootForTest"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x05ce
            r1 = r30
            java.lang.String r23 = X.AnonymousClass00U.A0L(r1, r8)
            X.6c3 r1 = r0.A04
            r19 = r0
            r20 = r5
            r21 = r1
            r22 = r4
            boolean r1 = r19.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r1 == 0) goto L_0x05d1
            return
        L_0x05ce:
            int r7 = r7 + 1
            goto L_0x05a7
        L_0x05d1:
            if (r37 == 0) goto L_0x0612
            boolean r1 = r5 instanceof android.webkit.WebView
            if (r1 == 0) goto L_0x0612
            X.6g7 r10 = r0.A02
            r9 = r5
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            X.76k r7 = new X.76k
            r7.<init>(r9)
            java.util.Set r1 = r10.A01
            r1.add(r7)
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r6 = r7.A01
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            int r6 = r7.A02
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            float r1 = r1.scaledDensity
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r6, r1}
            java.lang.String r1 = "(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();"
            java.lang.String r6 = java.lang.String.format(r1, r6)
            X.7S1 r1 = new X.7S1
            r1.<init>(r7, r10)
            r9.evaluateJavascript(r6, r1)
        L_0x0612:
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0012
            r6 = r5
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r1 = r6.getChildCount()
            if (r1 <= 0) goto L_0x0012
            r7 = r30
            java.lang.String r23 = X.AnonymousClass00U.A0L(r7, r8)
            r7 = r18
            int[] r7 = new int[r7]
            r5.getLocationOnScreen(r7)
            r5 = 0
        L_0x062d:
            android.view.View r21 = r6.getChildAt(r5)
            r24 = r7[r3]
            r25 = r7[r2]
            r20 = r0
            r22 = r4
            r20.A02(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r5 = r5 + 1
            if (r5 >= r1) goto L_0x0012
            goto L_0x062d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122007Jk.A02(android.view.View, java.io.PrintWriter, java.lang.String, int, int, boolean, boolean, boolean, boolean):void");
    }
}
