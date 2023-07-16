package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.0KC  reason: invalid class name */
public final class AnonymousClass0KC {
    public static final AnonymousClass0KB A0B = new AnonymousClass0KB();
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass0KB A03;
    public final Class A04;
    public final Object A05 = new Object();
    public final String A06;
    public final Constructor A07;
    public final Constructor A08;
    public final Method A09;
    public final AnonymousClass0K4[] A0A;

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Executable, java.lang.reflect.Method] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0KC(java.lang.Class r11, java.lang.Class[] r12, int r13) {
        /*
            r10 = this;
            r4 = 0
            r10.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r10.A05 = r0
            r2 = 0
            r10.A04 = r11
            java.lang.String r1 = "ObjPool_"
            java.lang.String r0 = r11.getSimpleName()
            java.lang.String r5 = X.AnonymousClass00U.A0L(r1, r0)
            r10.A06 = r5
            r10.A02 = r13
            java.lang.String r0 = "newInitWith"
            java.lang.reflect.Method r1 = r11.getDeclaredMethod(r0, r12)     // Catch:{ NoSuchMethodException -> 0x0064 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x0064 }
            int r0 = r1.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0064 }
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch:{ NoSuchMethodException -> 0x0064 }
            if (r0 != 0) goto L_0x0050
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0037 }
            r11.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0037 }
            goto L_0x00ba
        L_0x0037:
            r0 = move-exception
            java.lang.String r1 = java.util.Arrays.toString(r12)     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r11, r1, r0}     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "%s: Ctor %s. newInitWith (%s) cannot be used if there is no empty ctor. Err msg: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x0064 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0064 }
            goto L_0x0063
        L_0x0050:
            java.lang.String r0 = java.util.Arrays.toString(r12)     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r11, r0}     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "%s: Method %s. newInitWith (%s) cannot be static."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0064 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x0064 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ NoSuchMethodException -> 0x0064 }
        L_0x0064:
            r3 = move-exception
            r3.getMessage()
            r9 = 0
            r8 = 0
            r7 = 0
        L_0x006b:
            int r0 = r12.length
            if (r9 >= r0) goto L_0x00b8
            r6 = r12[r9]
            boolean r0 = r6.isPrimitive()
            r1 = 2
            if (r0 != 0) goto L_0x007c
            int r8 = r8 + 1
            if (r1 >= r8) goto L_0x0089
            goto L_0x008c
        L_0x007c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x008c
            int r7 = r7 + 1
            if (r1 >= r7) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x006b
        L_0x008c:
            java.lang.reflect.Constructor r1 = r11.getDeclaredConstructor(r12)     // Catch:{ NoSuchMethodException -> 0x0095 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x0095 }
            goto L_0x00ba
        L_0x0095:
            r0 = move-exception
            r0.getMessage()
            java.lang.String r2 = java.util.Arrays.toString(r12)
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1, r0}
            java.lang.String r0 = "%s: Can't create an inst with the given types, \n you must either use default handled types (any combination of at most 2 objs and 2 ints) \n OR a ctor or method initer with name newInitWith which takes args (%s).\n\t Method init errmsg: %s\n\t ctor init errmsg: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r5, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r3)
            throw r1
        L_0x00b8:
            X.0KB r1 = A0B
        L_0x00ba:
            boolean r0 = r1 instanceof X.AnonymousClass0KB
            if (r0 == 0) goto L_0x00c9
            X.0KB r1 = (X.AnonymousClass0KB) r1
            r10.A03 = r1
            r10.A09 = r4
            r10.A07 = r4
            java.lang.String r4 = "default initer"
            goto L_0x00d7
        L_0x00c9:
            boolean r0 = r1 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L_0x00f8
            r10.A03 = r4
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r10.A09 = r1
            r10.A07 = r4
            java.lang.String r4 = "method initer"
        L_0x00d7:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x00e2 }
            java.lang.reflect.Constructor r1 = r11.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x00e2 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x00e2 }
            goto L_0x0107
        L_0x00e2:
            r3 = move-exception
            java.lang.String r2 = "Could not find empty ctor "
            java.lang.String r1 = ": "
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r4, r1, r0)
            android.util.Log.w(r5, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L_0x00f8:
            boolean r0 = r1 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L_0x0112
            r10.A03 = r4
            r10.A09 = r4
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            r10.A07 = r1
            r10.A08 = r4
            goto L_0x0109
        L_0x0107:
            r10.A08 = r1
        L_0x0109:
            X.0K4[] r0 = new X.AnonymousClass0K4[r13]
            r10.A0A = r0
            r10.A00 = r2
            r10.A01 = r2
            return
        L_0x0112:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KC.<init>(java.lang.Class, java.lang.Class[], int):void");
    }

    private AnonymousClass0K4 A00() {
        if (this.A00 == this.A01) {
            return null;
        }
        synchronized (this.A05) {
            int i = this.A00;
            if (i == this.A01) {
                return null;
            }
            AnonymousClass0K4[] r0 = this.A0A;
            AnonymousClass0K4 r2 = r0[i];
            r0[i] = null;
            int i2 = i + 1;
            int i3 = this.A02;
            if (i3 <= i2) {
                i2 -= i3;
            }
            this.A00 = i2;
            return r2;
        }
    }

    public static AnonymousClass0K4 A01(AnonymousClass0KC r5, Object obj, Object obj2, int i, int i2) {
        String str;
        String str2;
        r5.A03.getClass();
        AnonymousClass0K4 A002 = r5.A00();
        if (A002 == null) {
            Constructor constructor = r5.A08;
            String str3 = r5.A06;
            AnonymousClass0KW.A02(constructor, "%s: Must have an empty ctor to create obj pool item", str3);
            try {
                A002 = (AnonymousClass0K4) constructor.newInstance(new Object[0]);
                AnonymousClass0EY r2 = (AnonymousClass0EY) A002;
                boolean z = false;
                if (r2.A00 == null) {
                    z = true;
                }
                AnonymousClass0KW.A04(z);
                r2.A00 = r5;
            } catch (Exception e) {
                Class cls = r5.A04;
                if (obj != null) {
                    str = obj.getClass().getName();
                } else {
                    str = "<Unknown Class>";
                }
                if (obj2 != null) {
                    str2 = obj2.getClass().getName();
                } else {
                    str2 = "<Unknown Class>";
                }
                throw new RuntimeException(String.format("%s: Failed to init %s with args (obj1: %s, obj2: %s, arg1: %s, arg2: %s)", new Object[]{str3, cls, str, str2, Integer.valueOf(i), Integer.valueOf(i2)}), e);
            }
        }
        A002.C9A(i, i2, obj, obj2);
        return A002;
    }

    public static void A03(Object obj, boolean z) {
        if (obj != null && (obj instanceof AnonymousClass0K4)) {
            if (obj instanceof AnonymousClass0EY) {
                ((AnonymousClass0EY) obj).A02(z);
                return;
            }
            AnonymousClass0K4 r1 = (AnonymousClass0K4) obj;
            if (!z || ((AnonymousClass0EY) r1).A02) {
                AnonymousClass0KC r0 = ((AnonymousClass0EY) r1).A00;
                r0.getClass();
                r0.A04(r1);
            }
        }
    }

    public final void A04(AnonymousClass0K4 r8) {
        if (r8 != null) {
            AnonymousClass0KC r0 = ((AnonymousClass0EY) r8).A00;
            r0.getClass();
            int i = 0;
            boolean z = false;
            if (r0 == this) {
                z = true;
            }
            String str = this.A06;
            if (z) {
                int i2 = this.A00;
                int i3 = this.A01;
                if (i2 == 0) {
                    i2 = this.A02;
                }
                if (i3 != i2 - 1) {
                    r8.CZZ();
                    synchronized (this.A05) {
                        int i4 = this.A00;
                        int i5 = this.A01;
                        boolean z2 = false;
                        if (i4 != 0) {
                            z2 = true;
                            if (i5 == i4 - 1) {
                            }
                        }
                        boolean z3 = false;
                        if (i5 == this.A02 - 1) {
                            z3 = true;
                        }
                        if (z2 || !z3) {
                            this.A0A[i5] = r8;
                            if (!z3) {
                                i = i5 + 1;
                            }
                            this.A01 = i;
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("%s: Recycle was given an inst of another pool", (Object) str));
        }
    }

    public static AnonymousClass0K4 A02(AnonymousClass0KC r6, Object... objArr) {
        AnonymousClass0K4 r4;
        AnonymousClass0K4 A002 = r6.A00();
        if (A002 == null) {
            try {
                Constructor constructor = r6.A08;
                if (r6.A03 != null) {
                    r4 = AnonymousClass0KB.A00((AnonymousClass0K4) null, r6, objArr, false);
                } else {
                    Constructor constructor2 = r6.A07;
                    if (constructor2 != null) {
                        r4 = (AnonymousClass0K4) constructor2.newInstance(objArr);
                    } else {
                        Method method = r6.A09;
                        if (method != null) {
                            AnonymousClass0KW.A02(constructor, "%s: Must have an empty ctor to use method init", r6.A06);
                            r4 = (AnonymousClass0K4) constructor.newInstance(new Object[0]);
                            method.invoke(r4, objArr);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                AnonymousClass0EY r2 = (AnonymousClass0EY) r4;
                boolean z = false;
                if (r2.A00 == null) {
                    z = true;
                }
                AnonymousClass0KW.A04(z);
                r2.A00 = r6;
                return r4;
            } catch (Exception e) {
                throw new RuntimeException(String.format("Failed to init %s with %d args (%s)", new Object[]{r6.A04, Integer.valueOf(objArr.length), Arrays.toString(objArr)}), e);
            }
        } else if (r6.A03 != null) {
            AnonymousClass0KB.A00(A002, (AnonymousClass0KC) null, objArr, true);
            return A002;
        } else {
            Method method2 = r6.A09;
            if (method2 != null) {
                try {
                    method2.invoke(A002, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException(String.format("%s: Cannot reuse class %s with method %s. Err %s: %s", new Object[]{r6.A06, r6.A04, method2.getName(), e2.getClass(), e2.getMessage()}), e2);
                }
            }
            ((AnonymousClass0EY) A002).C9A(0, 0, (Object) null, (Object) null);
            return A002;
        }
    }
}
