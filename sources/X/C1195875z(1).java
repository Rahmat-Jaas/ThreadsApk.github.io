package X;

/* renamed from: X.75z  reason: invalid class name and case insensitive filesystem */
public final class C1195875z {
    public Object A00 = null;
    public Object A01 = null;
    public boolean A02 = false;

    public static String A00(C1195875z r5, String str, int i) {
        Object obj;
        if (i == 0) {
            obj = r5.A00;
        } else if (i != 1) {
            obj = null;
        } else {
            try {
                obj = r5.A01;
            } catch (Exception unused) {
                return null;
            }
        }
        if (obj == null) {
            return null;
        }
        Object invoke = obj.getClass().getDeclaredMethod(str, new Class[0]).invoke(obj, new Object[0]);
        invoke.getClass();
        return invoke.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195875z(android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.A00 = r0
            r8.A01 = r0
            r5 = 0
            r8.A02 = r5
            java.lang.String r0 = "android.telephony.MultiSimTelephonyManager"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0058 }
            java.lang.reflect.Constructor[] r7 = r6.getConstructors()
            int r4 = r7.length
            r3 = 0
        L_0x0017:
            if (r3 >= r4) goto L_0x0058
            r2 = r7[r3]
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r1 = r0.length
            r0 = 2
            if (r1 != r0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0027:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{  }
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0}     // Catch:{  }
            java.lang.Object r3 = r2.newInstance(r0)     // Catch:{  }
            java.lang.Object[] r0 = X.C18210wN.A1Y(r9, r4)     // Catch:{  }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{  }
            java.lang.String r1 = "getSubscriberInfo"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{  }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r1, r0)     // Catch:{  }
            r1.setAccessible(r4)     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{  }
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch:{  }
            r8.A00 = r0     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{  }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{  }
            r8.A01 = r0     // Catch:{  }
            goto L_0x005a
        L_0x0058:
            r0 = 0
            goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            r8.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195875z.<init>(android.content.Context):void");
    }
}
