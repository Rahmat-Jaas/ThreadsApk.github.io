package com.facebook.common.dextricks;

public class CorruptedApplicationStateException extends RuntimeException {
    public final Remedy mRemedy;

    public enum Remedy {
        REINSTALL,
        REBOOT,
        UNKNOWN
    }

    /* renamed from: com.facebook.common.dextricks.CorruptedApplicationStateException$1  reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy[] r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy = r2
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REBOOT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REINSTALL     // Catch:{ NoSuchFieldError -> 0x001b }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001b }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.CorruptedApplicationStateException.AnonymousClass1.<clinit>():void");
        }
    }

    public CorruptedApplicationStateException(Throwable th) {
        this(th, Remedy.UNKNOWN);
    }

    public String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder("Application is in corrupt state. ");
        Remedy remedy = this.mRemedy;
        int ordinal = remedy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                str = "Reinstall application.";
            }
            sb.append("[ mRemedy = ");
            sb.append(remedy);
            sb.append(" ]");
            return sb.toString();
        }
        str = "Reboot device. ";
        sb.append(str);
        sb.append("[ mRemedy = ");
        sb.append(remedy);
        sb.append(" ]");
        return sb.toString();
    }

    public Remedy getRemedy() {
        return this.mRemedy;
    }

    public CorruptedApplicationStateException(Throwable th, Remedy remedy) {
        super(th);
        this.mRemedy = remedy;
    }
}
