package X;

import java.io.File;

/* renamed from: X.0RS  reason: invalid class name */
public final class AnonymousClass0RS implements C04050Mb {
    public final File A00;

    public AnonymousClass0RS(File file) {
        this.A00 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0Q;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x038e: MOVE  (r1v251 int) = (r92v20 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x13c2 A[ExcHandler: IOException | BufferOverflowException (e java.lang.Throwable), PHI: r5 r6 r9 r12 r14 r19 r20 r23 r25 r27 r28 r33 r35 r37 r39 r49 r50 r51 r53 r55 r57 r65 r66 r67 r68 r69 r71 r78 r80 r81 r82 r83 r90 r91 r92 r93 
      PHI: (r5v12 int) = (r5v0 int), (r5v14 int), (r5v14 int), (r5v14 int), (r5v0 int), (r5v0 int), (r5v18 int), (r5v18 int), (r5v18 int), (r5v18 int), (r5v18 int), (r5v18 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v20 int), (r5v20 int), (r5v20 int), (r5v0 int), (r5v0 int), (r5v22 int), (r5v0 int), (r5v27 int), (r5v27 int), (r5v27 int), (r5v27 int), (r5v27 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v29 int), (r5v29 int), (r5v29 int), (r5v0 int), (r5v0 int), (r5v31 int), (r5v0 int), (r5v36 int), (r5v36 int), (r5v36 int), (r5v36 int), (r5v36 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v0 int), (r5v38 int), (r5v38 int), (r5v38 int), (r5v0 int), (r5v0 int), (r5v40 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v6 short) = (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v9 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short), (r6v0 short) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v11 long) = (r9v0 long), (r9v0 long), (r9v0 long), (r9v0 long), (r9v0 long), (r9v0 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v14 long), (r9v0 long), (r9v0 long), (r9v0 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v17 long), (r9v0 long), (r9v0 long), (r9v0 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v20 long), (r9v0 long), (r9v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v4 long) = (r12v0 long), (r12v0 long), (r12v0 long), (r12v0 long), (r12v0 long), (r12v0 long), (r12v8 long), (r12v8 long), (r12v8 long), (r12v8 long), (r12v8 long), (r12v8 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v7 long), (r12v0 long), (r12v0 long), (r12v0 long), (r12v13 long), (r12v13 long), (r12v13 long), (r12v13 long), (r12v13 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v12 long), (r12v0 long), (r12v0 long), (r12v0 long), (r12v18 long), (r12v18 long), (r12v18 long), (r12v18 long), (r12v18 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v17 long), (r12v0 long), (r12v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v4 long) = (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v7 long), (r14v7 long), (r14v0 long), (r14v8 long), (r14v9 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v11 long), (r14v0 long), (r14v12 long), (r14v13 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v15 long), (r14v15 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long), (r14v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v4 int) = (r19v0 int), (r19v6 int), (r19v6 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v10 int), (r19v10 int), (r19v10 int), (r19v10 int), (r19v10 int), (r19v10 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v12 int), (r19v12 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v14 int), (r19v0 int), (r19v18 int), (r19v18 int), (r19v18 int), (r19v18 int), (r19v18 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v20 int), (r19v20 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v22 int), (r19v0 int), (r19v26 int), (r19v26 int), (r19v26 int), (r19v26 int), (r19v26 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v28 int), (r19v28 int), (r19v0 int), (r19v0 int), (r19v0 int), (r19v30 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v4 long) = (r20v0 long), (r20v0 long), (r20v0 long), (r20v0 long), (r20v0 long), (r20v0 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v7 long), (r20v0 long), (r20v0 long), (r20v0 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v10 long), (r20v0 long), (r20v0 long), (r20v0 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v13 long), (r20v0 long), (r20v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v4 long) = (r23v0 long), (r23v0 long), (r23v0 long), (r23v0 long), (r23v0 long), (r23v0 long), (r23v8 long), (r23v8 long), (r23v8 long), (r23v8 long), (r23v8 long), (r23v8 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v7 long), (r23v0 long), (r23v0 long), (r23v0 long), (r23v13 long), (r23v13 long), (r23v13 long), (r23v13 long), (r23v13 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v12 long), (r23v0 long), (r23v0 long), (r23v0 long), (r23v18 long), (r23v18 long), (r23v18 long), (r23v18 long), (r23v18 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v17 long), (r23v0 long), (r23v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v4 long) = (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v7 long), (r25v7 long), (r25v0 long), (r25v8 long), (r25v9 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v11 long), (r25v0 long), (r25v12 long), (r25v13 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v15 long), (r25v15 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long), (r25v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v5 byte) = (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v9 byte), (r27v9 byte), (r27v9 byte), (r27v9 byte), (r27v9 byte), (r27v9 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v8 byte), (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v14 byte), (r27v14 byte), (r27v14 byte), (r27v14 byte), (r27v14 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v13 byte), (r27v0 byte), (r27v0 byte), (r27v0 byte), (r27v19 byte), (r27v19 byte), (r27v19 byte), (r27v19 byte), (r27v19 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v18 byte), (r27v0 byte), (r27v0 byte) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r28v4 long) = (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v7 long), (r28v7 long), (r28v0 long), (r28v8 long), (r28v9 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v11 long), (r28v0 long), (r28v12 long), (r28v13 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v15 long), (r28v15 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long), (r28v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r33v5 long) = (r33v0 long), (r33v0 long), (r33v8 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v11 long), (r33v11 long), (r33v11 long), (r33v11 long), (r33v11 long), (r33v11 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v14 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v15 long), (r33v0 long), (r33v20 long), (r33v20 long), (r33v20 long), (r33v20 long), (r33v20 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v23 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v24 long), (r33v0 long), (r33v29 long), (r33v29 long), (r33v29 long), (r33v29 long), (r33v29 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v32 long), (r33v0 long), (r33v0 long), (r33v0 long), (r33v33 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r35v4 long) = (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v7 long), (r35v7 long), (r35v0 long), (r35v8 long), (r35v9 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v11 long), (r35v0 long), (r35v12 long), (r35v13 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v15 long), (r35v15 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long), (r35v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r37v4 long) = (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v7 long), (r37v7 long), (r37v0 long), (r37v8 long), (r37v9 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v11 long), (r37v0 long), (r37v12 long), (r37v13 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v15 long), (r37v15 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long), (r37v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r39v4 long) = (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v7 long), (r39v7 long), (r39v0 long), (r39v8 long), (r39v9 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v11 long), (r39v0 long), (r39v12 long), (r39v13 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v15 long), (r39v15 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long), (r39v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r49v5 byte) = (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v8 byte), (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v11 byte), (r49v0 byte), (r49v0 byte), (r49v0 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v14 byte), (r49v0 byte), (r49v0 byte) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r50v4 int) = (r50v0 int), (r50v0 int), (r50v0 int), (r50v0 int), (r50v0 int), (r50v0 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v7 int), (r50v0 int), (r50v0 int), (r50v0 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v10 int), (r50v0 int), (r50v0 int), (r50v0 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v13 int), (r50v0 int), (r50v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r51v4 long) = (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v7 long), (r51v7 long), (r51v0 long), (r51v8 long), (r51v9 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v11 long), (r51v0 long), (r51v12 long), (r51v13 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long), (r51v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r53v4 long) = (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v7 long), (r53v7 long), (r53v0 long), (r53v8 long), (r53v9 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v11 long), (r53v0 long), (r53v12 long), (r53v13 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long), (r53v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r55v4 long) = (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v7 long), (r55v7 long), (r55v0 long), (r55v8 long), (r55v9 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v11 long), (r55v0 long), (r55v12 long), (r55v13 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long), (r55v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r57v4 long) = (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v7 long), (r57v7 long), (r57v0 long), (r57v8 long), (r57v9 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v11 long), (r57v0 long), (r57v12 long), (r57v13 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long), (r57v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r65v4 short) = (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v7 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v10 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short), (r65v0 short) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r66v4 java.lang.String) = (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v7 java.lang.String), (r66v7 java.lang.String), (r66v0 java.lang.String), (r66v8 java.lang.String), (r66v9 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v11 java.lang.String), (r66v0 java.lang.String), (r66v12 java.lang.String), (r66v13 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v15 java.lang.String), (r66v15 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String), (r66v0 java.lang.String) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r67v4 int) = (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v7 int), (r67v7 int), (r67v0 int), (r67v8 int), (r67v9 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v11 int), (r67v0 int), (r67v12 int), (r67v13 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int), (r67v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r68v4 int) = (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v7 int), (r68v7 int), (r68v0 int), (r68v8 int), (r68v9 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v11 int), (r68v0 int), (r68v12 int), (r68v13 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int), (r68v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r69v4 long) = (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v7 long), (r69v7 long), (r69v0 long), (r69v8 long), (r69v9 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long), (r69v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r71v4 java.lang.String) = (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v7 java.lang.String), (r71v7 java.lang.String), (r71v0 java.lang.String), (r71v8 java.lang.String), (r71v9 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v11 java.lang.String), (r71v0 java.lang.String), (r71v12 java.lang.String), (r71v13 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v15 java.lang.String), (r71v15 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String), (r71v0 java.lang.String) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r78v4 long) = (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v7 long), (r78v7 long), (r78v0 long), (r78v8 long), (r78v9 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long), (r78v0 long) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r80v4 short) = (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v7 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short), (r80v0 short) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r81v4 short) = (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v7 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short), (r81v0 short) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r82v4 X.0QD[]) = (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v7 X.0QD[]), (r82v7 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]), (r82v0 X.0QD[]) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r83v4 boolean) = (r83v0 boolean), (r83v0 boolean), (r83v0 boolean), (r83v0 boolean), (r83v0 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean), (r83v6 boolean) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r90v4 int) = (r90v0 int), (r90v0 int), (r90v0 int), (r90v0 int), (r90v0 int), (r90v0 int), (r90v8 int), (r90v8 int), (r90v8 int), (r90v8 int), (r90v8 int), (r90v8 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v7 int), (r90v0 int), (r90v0 int), (r90v0 int), (r90v16 int), (r90v16 int), (r90v16 int), (r90v16 int), (r90v16 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v15 int), (r90v0 int), (r90v0 int), (r90v0 int), (r90v24 int), (r90v24 int), (r90v24 int), (r90v24 int), (r90v24 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v23 int), (r90v0 int), (r90v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r91v4 int) = (r91v0 int), (r91v0 int), (r91v0 int), (r91v0 int), (r91v0 int), (r91v0 int), (r91v8 int), (r91v8 int), (r91v8 int), (r91v8 int), (r91v8 int), (r91v8 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v7 int), (r91v0 int), (r91v0 int), (r91v0 int), (r91v16 int), (r91v16 int), (r91v16 int), (r91v16 int), (r91v16 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v15 int), (r91v0 int), (r91v0 int), (r91v0 int), (r91v24 int), (r91v24 int), (r91v24 int), (r91v24 int), (r91v24 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v23 int), (r91v0 int), (r91v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r92v4 int) = (r92v0 int), (r92v0 int), (r92v0 int), (r92v0 int), (r92v0 int), (r92v0 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v7 int), (r92v0 int), (r92v0 int), (r92v0 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v12 int), (r92v0 int), (r92v0 int), (r92v0 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v17 int), (r92v0 int), (r92v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r93v4 int) = (r93v0 int), (r93v0 int), (r93v0 int), (r93v0 int), (r93v0 int), (r93v0 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v7 int), (r93v0 int), (r93v0 int), (r93v0 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v12 int), (r93v0 int), (r93v0 int), (r93v0 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v17 int), (r93v0 int), (r93v0 int) binds: [B:5:0x01a7, B:601:0x13af, B:602:?, B:597:0x13a9, B:593:0x13a3, B:450:0x0f34, B:539:0x11cc, B:554:0x1251, B:578:0x1344, B:544:0x11e7, B:548:0x1233, B:545:?, B:506:0x1160, B:511:0x117b, B:521:0x119e, B:522:?, B:504:0x115b, B:505:?, B:500:0x1155, B:496:0x114f, B:481:0x10f7, B:446:0x0f2f, B:253:0x08db, B:333:0x0af3, B:348:0x0b70, B:338:0x0b0e, B:342:0x0b52, B:339:?, B:300:0x0a89, B:305:0x0aa4, B:315:0x0ac7, B:316:?, B:298:0x0a84, B:299:?, B:294:0x0a7e, B:290:0x0a78, B:275:0x0a20, B:249:0x08d6, B:93:0x03c4, B:167:0x05cd, B:191:0x066a, B:201:0x06d1, B:172:0x05e8, B:185:0x064c, B:134:0x0563, B:139:0x057e, B:149:0x05a1, B:150:?, B:132:0x055e, B:133:?, B:128:0x0558, B:124:0x0552, B:109:0x04fa, B:89:0x03bf] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x01a7] */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x1427  */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x1430  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x143d  */
    /* JADX WARNING: Removed duplicated region for block: B:636:0x144c  */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x1457  */
    /* JADX WARNING: Removed duplicated region for block: B:848:0x191d  */
    /* JADX WARNING: Removed duplicated region for block: B:856:0x1955  */
    /* JADX WARNING: Removed duplicated region for block: B:915:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:333:0x0af3=Splitter:B:333:0x0af3, B:249:0x08d6=Splitter:B:249:0x08d6, B:539:0x11cc=Splitter:B:539:0x11cc, B:167:0x05cd=Splitter:B:167:0x05cd, B:89:0x03bf=Splitter:B:89:0x03bf, B:446:0x0f2f=Splitter:B:446:0x0f2f} */
    public final void CWp(X.C04170Mn r127, X.AnonymousClass0ND r128) {
        /*
            r126 = this;
            r8 = 0
            r125 = r127
            r0 = r125
            X.C04220Ms.A0B(r0, r8)
            r32 = 1
            r124 = r128
            r1 = r32
            r0 = r124
            X.C04220Ms.A0B(r0, r1)
            r0 = r126
            java.io.File r0 = r0.A00
            r123 = r0
            java.lang.String r2 = "nightwatch.txt"
            java.io.File r89 = new java.io.File
            r1 = r89
            r1.<init>(r0, r2)
            boolean r0 = r89.exists()
            if (r0 == 0) goto L_0x1a2b
            r30 = 0
            r83 = 0
            r5 = -1
            r19 = -1
            r33 = 0
            r92 = -1
            r93 = -1
            r9 = 0
            r90 = -1
            r91 = -1
            r12 = 0
            r23 = 0
            r28 = 0
            r78 = 0
            r27 = -1
            java.lang.String r117 = ""
            r66 = r117
            r25 = 0
            r69 = 0
            r71 = r117
            r6 = -1
            r65 = -1
            r14 = -1
            r39 = -1
            r37 = -1
            r35 = -1
            r51 = -1
            r53 = -1
            r55 = -1
            r57 = -1
            r67 = -1
            r68 = -1
            r20 = 0
            r49 = -1
            r72 = -1
            r73 = -1
            r74 = -1
            r75 = -1
            r22 = -1
            r31 = -1
            r76 = -1
            r77 = -1
            r45 = -1
            r41 = -1
            r82 = r30
            r43 = -1
            r47 = -1
            r59 = -1
            r61 = -1
            r63 = -1
            java.lang.String r0 = "oom_score"
            X.0Q5 r11 = new X.0Q5
            r11.<init>(r0, r8)
            java.lang.String r1 = "oom_score_adj"
            X.0Q5 r122 = new X.0Q5
            r0 = r122
            r0.<init>(r1, r8)
            java.lang.String r1 = "oom_score_adj_error"
            X.0Q5 r114 = new X.0Q5
            r0 = r114
            r0.<init>(r1, r8)
            java.lang.String r1 = "process_count"
            X.0Q5 r121 = new X.0Q5
            r0 = r121
            r0.<init>(r1, r8)
            java.lang.String r1 = "battery_capacity"
            X.0Q5 r113 = new X.0Q5
            r0 = r113
            r0.<init>(r1, r8)
            java.lang.String r1 = "mem_available_mb"
            X.0Q5 r120 = new X.0Q5
            r0 = r120
            r0.<init>(r1, r8)
            java.lang.String r1 = "fd_count"
            X.0Q5 r112 = new X.0Q5
            r0 = r112
            r0.<init>(r1, r8)
            java.lang.String r2 = "mem_usage"
            X.0Q5 r115 = new X.0Q5
            r1 = r115
            r0 = r32
            r1.<init>(r2, r0)
            java.lang.String r2 = "memsw_usage"
            X.0Q5 r116 = new X.0Q5
            r1 = r116
            r1.<init>(r2, r0)
            java.lang.String r1 = "root_storage_kb"
            X.0Q5 r111 = new X.0Q5
            r0 = r111
            r0.<init>(r1, r8)
            java.lang.String r1 = "external_storage_kb"
            X.0Q5 r110 = new X.0Q5
            r0 = r110
            r0.<init>(r1, r8)
            java.lang.String r1 = "battery_temperature_10x"
            X.0Q5 r109 = new X.0Q5
            r0 = r109
            r0.<init>(r1, r8)
            java.lang.String r1 = "traffic_total_rx_mb"
            X.0Q5 r108 = new X.0Q5
            r0 = r108
            r0.<init>(r1, r8)
            java.lang.String r1 = "traffic_total_tx_mb"
            X.0Q5 r106 = new X.0Q5
            r0 = r106
            r0.<init>(r1, r8)
            java.lang.String r1 = "traffic_mobile_rx_mb"
            X.0Q5 r103 = new X.0Q5
            r0 = r103
            r0.<init>(r1, r8)
            java.lang.String r1 = "traffic_mobile_tx_mb"
            X.0Q5 r102 = new X.0Q5
            r0 = r102
            r0.<init>(r1, r8)
            java.lang.String r1 = "connection_type"
            X.0Q5 r99 = new X.0Q5
            r0 = r99
            r0.<init>(r1, r8)
            java.lang.String r1 = "process_importance"
            X.0Q5 r94 = new X.0Q5
            r0 = r94
            r0.<init>(r1, r8)
            java.lang.String r1 = "lmkd_other_free"
            X.0Q5 r107 = new X.0Q5
            r0 = r107
            r0.<init>(r1, r8)
            java.lang.String r1 = "lmkd_other_file"
            X.0Q5 r105 = new X.0Q5
            r0 = r105
            r0.<init>(r1, r8)
            java.lang.String r1 = "lmkd_proc_rss"
            X.0Q5 r119 = new X.0Q5
            r0 = r119
            r0.<init>(r1, r8)
            java.lang.String r1 = "minflt"
            X.0Q5 r104 = new X.0Q5
            r0 = r104
            r0.<init>(r1, r8)
            java.lang.String r1 = "majflt"
            X.0Q5 r118 = new X.0Q5
            r0 = r118
            r0.<init>(r1, r8)
            java.lang.String r1 = "utime"
            X.0Q5 r101 = new X.0Q5
            r0 = r101
            r0.<init>(r1, r8)
            java.lang.String r1 = "stime"
            X.0Q5 r98 = new X.0Q5
            r0 = r98
            r0.<init>(r1, r8)
            java.lang.String r1 = "lmkd_detector1"
            X.0Q6 r100 = new X.0Q6
            r0 = r100
            r0.<init>(r1)
            java.lang.String r1 = "lmkd_detector2"
            X.0Q6 r97 = new X.0Q6
            r0 = r97
            r0.<init>(r1)
            java.lang.String r1 = "lmkd_detector_200_1"
            X.0Q6 r96 = new X.0Q6
            r0 = r96
            r0.<init>(r1)
            java.lang.String r1 = "lmkd_detector_200_2"
            X.0Q6 r95 = new X.0Q6
            r0 = r95
            r0.<init>(r1)
            r80 = -1
            r81 = -1
            r50 = -1
            java.lang.String r87 = "failed to parse nightwatch log file %s"
            java.nio.ByteBuffer r2 = X.AnonymousClass0QE.A02(r89)
            if (r2 == 0) goto L_0x141e
            r86 = 7
            r85 = 6
            r18 = 2
            r88 = 8
            r84 = 5
            r2.mark()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r88
            byte[] r3 = new byte[r0]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r2.get(r3)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            byte r1 = r3[r8]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = 77
            if (r1 != r0) goto L_0x01c9
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r3)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x01bc:
            java.lang.String r7 = r0.trim()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = "MMAP"
            boolean r0 = r7.startsWith(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r0 == 0) goto L_0x1370
            goto L_0x01cc
        L_0x01c9:
            r0 = r117
            goto L_0x01bc
        L_0x01cc:
            r1 = 0
            r4 = 4
        L_0x01ce:
            int r0 = r7.length()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r4 >= r0) goto L_0x0201
            char r3 = r7.charAt(r4)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = 48
            if (r3 < r0) goto L_0x0200
            r0 = 57
            if (r3 > r0) goto L_0x01e8
            int r0 = r3 + -48
        L_0x01e2:
            int r1 = r1 << 4
            int r1 = r1 + r0
            int r4 = r4 + 1
            goto L_0x01ce
        L_0x01e8:
            r0 = 97
            if (r3 < r0) goto L_0x01f5
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L_0x0200
            int r0 = r3 + -97
        L_0x01f2:
            int r0 = r0 + 10
            goto L_0x01e2
        L_0x01f5:
            r0 = 65
            if (r3 < r0) goto L_0x0200
            r0 = 70
            if (r3 > r0) goto L_0x0200
            int r0 = r3 + -65
            goto L_0x01f2
        L_0x0200:
            r1 = -1
        L_0x0201:
            r83 = 1
            r0 = r32
            if (r1 < r0) goto L_0x135f
            r0 = r84
            if (r1 < r0) goto L_0x13f2
            if (r1 != r0) goto L_0x03c0
            long r20 = r2.getLong()     // Catch:{ all -> 0x039f }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ all -> 0x039f }
            long r12 = r2.getLong()     // Catch:{ all -> 0x039f }
            long r23 = r2.getLong()     // Catch:{ all -> 0x039f }
            long r9 = r2.getLong()     // Catch:{ all -> 0x039f }
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            if (r0 == r5) goto L_0x0227
            r90 = r0
        L_0x0227:
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            if (r0 == r5) goto L_0x022f
            r91 = r0
        L_0x022f:
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            if (r0 == r5) goto L_0x0237
            r92 = r0
        L_0x0237:
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            if (r0 == r5) goto L_0x023f
            r93 = r0
        L_0x023f:
            long r28 = r2.getLong()     // Catch:{ all -> 0x039f }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r2)     // Catch:{ all -> 0x039f }
            byte r27 = r2.get()     // Catch:{ all -> 0x039f }
            byte r0 = r2.get()     // Catch:{ all -> 0x039f }
            short r1 = (short) r0     // Catch:{ all -> 0x039f }
            r0 = r113
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r121
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r0 = r2.getShort()     // Catch:{ all -> 0x039f }
            r11.A08(r0)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r122
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r120
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r112
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r111
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r110
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            r11.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r122
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r121
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r113
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r120
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r112
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r111
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r110
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r109
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r99
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            byte r49 = r2.get()     // Catch:{ all -> 0x039f }
            int r0 = r2.position()     // Catch:{ all -> 0x039f }
            int r0 = r0 + 3
            r2.position(r0)     // Catch:{ all -> 0x039f }
            r0 = r109
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            long r0 = (long) r0     // Catch:{ all -> 0x039f }
            r3 = r108
            r3.A04(r0)     // Catch:{ all -> 0x039f }
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            long r0 = (long) r0     // Catch:{ all -> 0x039f }
            r3 = r106
            r3.A04(r0)     // Catch:{ all -> 0x039f }
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            long r0 = (long) r0     // Catch:{ all -> 0x039f }
            r3 = r103
            r3.A04(r0)     // Catch:{ all -> 0x039f }
            int r0 = r2.getInt()     // Catch:{ all -> 0x039f }
            long r0 = (long) r0     // Catch:{ all -> 0x039f }
            r3 = r102
            r3.A04(r0)     // Catch:{ all -> 0x039f }
            r0 = r108
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r106
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r103
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r3.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r99
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            long r25 = r2.getLong()     // Catch:{ all -> 0x039f }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r2)     // Catch:{ all -> 0x039f }
            int r50 = r2.getInt()     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r114
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            short r1 = r2.getShort()     // Catch:{ all -> 0x039f }
            r0 = r94
            r0.A08(r1)     // Catch:{ all -> 0x039f }
            r0 = r114
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            r0 = r94
            r0.A06(r2)     // Catch:{ all -> 0x039f }
            int r22 = r2.getInt()     // Catch:{ all -> 0x039f }
            if (r22 <= 0) goto L_0x037e
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ all -> 0x039f }
            r30 = r0
            int r31 = r2.getInt()     // Catch:{ all -> 0x039f }
            long r41 = r2.getLong()     // Catch:{ all -> 0x039f }
            r4 = 0
        L_0x0358:
            X.0QD r3 = new X.0QD     // Catch:{ all -> 0x039f }
            r3.<init>()     // Catch:{ all -> 0x039f }
            long r0 = r2.getLong()     // Catch:{ all -> 0x039f }
            r3.A00 = r0     // Catch:{ all -> 0x039f }
            long r0 = r2.getLong()     // Catch:{ all -> 0x039f }
            r3.A01 = r0     // Catch:{ all -> 0x039f }
            long r0 = r2.getLong()     // Catch:{ all -> 0x039f }
            r3.A02 = r0     // Catch:{ all -> 0x039f }
            long r0 = r2.getLong()     // Catch:{ all -> 0x039f }
            r3.A03 = r0     // Catch:{ all -> 0x039f }
            r30[r4] = r3     // Catch:{ all -> 0x039f }
            int r4 = r4 + 1
            r0 = r22
            if (r4 >= r0) goto L_0x037e
            goto L_0x0358
        L_0x037e:
            r1 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0388
            r1 = r9
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x038a
        L_0x0388:
            r33 = r1
        L_0x038a:
            r1 = r90
            if (r1 != r5) goto L_0x0392
            r1 = r92
            if (r1 == r5) goto L_0x0393
        L_0x0392:
            r5 = r1
        L_0x0393:
            r2 = r91
            if (r2 != r6) goto L_0x039b
            r2 = r93
            if (r2 == r6) goto L_0x13f2
        L_0x039b:
            r19 = r2
            goto L_0x13f2
        L_0x039f:
            r2 = move-exception
            r3 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x03aa
            r3 = r9
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x03ac
        L_0x03aa:
            r33 = r3
        L_0x03ac:
            r1 = r90
            if (r1 != r5) goto L_0x03b4
            r1 = r92
            if (r1 == r5) goto L_0x03b5
        L_0x03b4:
            r5 = r1
        L_0x03b5:
            r3 = r91
            if (r3 != r6) goto L_0x03bd
            r3 = r93
            if (r3 == r6) goto L_0x03bf
        L_0x03bd:
            r19 = r3
        L_0x03bf:
            throw r2     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x03c0:
            r0 = r85
            if (r1 != r0) goto L_0x06db
            long r20 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r9 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x03de
            r90 = r0
        L_0x03de:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x03e6
            r91 = r0
        L_0x03e6:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x03ee
            r92 = r0
        L_0x03ee:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x03f6
            r93 = r0
        L_0x03f6:
            byte r49 = r2.get()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            byte r0 = r2.get()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.position()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + 1
            r2.position(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.position()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + 2
            r2.position(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r0 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r11.A08(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r111
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r110
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r108
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r106
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r103
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r102
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r11.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r111
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r110
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r108
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r106
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r103
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r3.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            int r50 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            r89.getPath()     // Catch:{ BufferOverflowException -> 0x04f7, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0507
        L_0x04f7:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x0507:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.txt"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x0563
            java.nio.ByteBuffer r3 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r3 == 0) goto L_0x05ae
            r2 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r2]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = r3.remaining()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r3.get(r1, r8, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1, r8, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r2 = r0.split(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r1 = r2.length     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7 = 0
            if (r1 <= 0) goto L_0x05ae
            r4 = r2[r8]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r32
            if (r1 <= r0) goto L_0x054f
            r3 = r2[r32]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r18
            if (r1 <= r0) goto L_0x0550
            r7 = r2[r18]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x0550
        L_0x054f:
            r3 = r7
        L_0x0550:
            if (r4 == 0) goto L_0x0556
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0556, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0556:
            if (r3 == 0) goto L_0x055c
            int r19 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x055c, IOException | BufferOverflowException -> 0x13c2 }
        L_0x055c:
            if (r7 == 0) goto L_0x05ae
            long r33 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x05ae, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x05ae
        L_0x0563:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.bin"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x05ae
            java.nio.ByteBuffer r2 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r2 == 0) goto L_0x05ae
            r2.mark()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x0591
            r90 = r1
        L_0x0591:
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x0599
            r91 = r1
        L_0x0599:
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x059e, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x05ae
        L_0x059e:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x05ae:
            r1 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x05b8
            r1 = r9
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x05ba
        L_0x05b8:
            r33 = r1
        L_0x05ba:
            r1 = r90
            if (r1 != r6) goto L_0x05c2
            r1 = r92
            if (r1 == r6) goto L_0x05c3
        L_0x05c2:
            r5 = r1
        L_0x05c3:
            r1 = r91
            if (r1 != r6) goto L_0x05cb
            r1 = r93
            if (r1 == r6) goto L_0x05cd
        L_0x05cb:
            r19 = r1
        L_0x05cd:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".subsecond"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r4.<init>(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r0 = r4.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r0 == 0) goto L_0x064f
            java.nio.ByteBuffer r7 = X.AnonymousClass0QE.A02(r4)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r7 == 0) goto L_0x064f
            r7.mark()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r28 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r7)     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r25 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r7)     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r84
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r82 = r0
            r3 = 0
        L_0x0602:
            X.0QD r2 = new X.0QD     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r2.<init>()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r2.A00 = r0     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r2.A01 = r0     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r2.A02 = r0     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r2.A03 = r0     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            r82[r3] = r2     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            int r3 = r3 + 1
            r0 = r84
            if (r3 < r0) goto L_0x0602
            int r0 = r7.remaining()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= 0) goto L_0x0635
            long r14 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r39 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0635:
            int r0 = r7.remaining()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= 0) goto L_0x0643
            long r37 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            long r35 = r7.getLong()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0643:
            r4.getPath()     // Catch:{ BufferOverflowException -> 0x0647, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x064f
        L_0x0647:
            r2 = move-exception
            java.lang.String r1 = "NightwatchParser"
            java.lang.String r0 = "could not parse sub second mmap"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x064f:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".second"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7.<init>(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r0 = r7.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r0 == 0) goto L_0x13f2
            java.nio.ByteBuffer r4 = X.AnonymousClass0QE.A02(r7)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r4 == 0) goto L_0x13f2
            r4.mark()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r11.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            int r22 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            if (r22 <= 0) goto L_0x06c9
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r30 = r0
            int r31 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            long r41 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r3 = 0
        L_0x06a3:
            X.0QD r2 = new X.0QD     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r2.<init>()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r2.A00 = r0     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r2.A01 = r0     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r2.A02 = r0     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r2.A03 = r0     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            r30[r3] = r2     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            int r3 = r3 + 1
            r0 = r22
            if (r3 >= r0) goto L_0x06c9
            goto L_0x06a3
        L_0x06c9:
            r7.getPath()     // Catch:{ BufferOverflowException -> 0x06ce, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x13f2
        L_0x06ce:
            r1 = move-exception
            java.lang.String r0 = "NightwatchParser"
            java.lang.String r2 = r7.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x1358
        L_0x06db:
            r0 = r86
            if (r1 != r0) goto L_0x08d7
            r16 = -1
            long r20 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ all -> 0x08b6 }
            long r12 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r23 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r9 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            if (r0 == r5) goto L_0x06fb
            r90 = r0
        L_0x06fb:
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            if (r0 == r5) goto L_0x0703
            r91 = r0
        L_0x0703:
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            if (r0 == r5) goto L_0x070b
            r92 = r0
        L_0x070b:
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            if (r0 == r5) goto L_0x0713
            r93 = r0
        L_0x0713:
            long r28 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r2)     // Catch:{ all -> 0x08b6 }
            long r25 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r2)     // Catch:{ all -> 0x08b6 }
            long r14 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r39 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r37 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r35 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r51 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r53 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r55 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r57 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            int r67 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            int r68 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            byte r27 = r2.get()     // Catch:{ all -> 0x08b6 }
            byte r0 = r2.get()     // Catch:{ all -> 0x08b6 }
            short r1 = (short) r0     // Catch:{ all -> 0x08b6 }
            r0 = r113
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r121
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r0 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r11.A08(r0)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r122
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r120
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r112
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            if (r1 <= r5) goto L_0x078d
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ all -> 0x08b6 }
        L_0x078d:
            r0 = r111
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            if (r1 <= r5) goto L_0x079b
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ all -> 0x08b6 }
        L_0x079b:
            r0 = r110
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            long r43 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r47 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r59 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r61 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r63 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r11.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r122
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r121
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r113
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r120
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r112
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r115
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r116
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r111
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r110
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r109
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r99
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            byte r49 = r2.get()     // Catch:{ all -> 0x08b6 }
            int r0 = r2.position()     // Catch:{ all -> 0x08b6 }
            int r0 = r0 + 1
            r2.position(r0)     // Catch:{ all -> 0x08b6 }
            short r65 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r109
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x08b6 }
            r3 = r108
            r3.A04(r0)     // Catch:{ all -> 0x08b6 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x08b6 }
            r3 = r106
            r3.A04(r0)     // Catch:{ all -> 0x08b6 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x08b6 }
            r3 = r103
            r3.A04(r0)     // Catch:{ all -> 0x08b6 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x08b6 }
            r3 = r102
            r3.A04(r0)     // Catch:{ all -> 0x08b6 }
            r0 = r108
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r106
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r103
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r3.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r99
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            int r50 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r114
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            short r1 = r2.getShort()     // Catch:{ all -> 0x08b6 }
            r0 = r94
            r0.A08(r1)     // Catch:{ all -> 0x08b6 }
            r0 = r114
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            r0 = r94
            r0.A06(r2)     // Catch:{ all -> 0x08b6 }
            int r22 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            if (r22 <= 0) goto L_0x13d3
            int r31 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            r0 = r31
            if (r0 == r5) goto L_0x13d3
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ all -> 0x08b6 }
            r30 = r0
            int r76 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            int r77 = r2.getInt()     // Catch:{ all -> 0x08b6 }
            long r45 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            long r41 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r4 = 0
        L_0x0890:
            X.0QD r3 = new X.0QD     // Catch:{ all -> 0x08b6 }
            r3.<init>()     // Catch:{ all -> 0x08b6 }
            long r0 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r3.A00 = r0     // Catch:{ all -> 0x08b6 }
            long r0 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r3.A01 = r0     // Catch:{ all -> 0x08b6 }
            long r0 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r3.A02 = r0     // Catch:{ all -> 0x08b6 }
            long r0 = r2.getLong()     // Catch:{ all -> 0x08b6 }
            r3.A03 = r0     // Catch:{ all -> 0x08b6 }
            r30[r4] = r3     // Catch:{ all -> 0x08b6 }
            int r4 = r4 + 1
            r0 = r22
            if (r4 >= r0) goto L_0x13d3
            goto L_0x0890
        L_0x08b6:
            r2 = move-exception
            r3 = r12
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x08c1
            r3 = r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x08c3
        L_0x08c1:
            r33 = r3
        L_0x08c3:
            r1 = r90
            if (r1 != r5) goto L_0x08cb
            r1 = r92
            if (r1 == r5) goto L_0x08cc
        L_0x08cb:
            r5 = r1
        L_0x08cc:
            r3 = r91
            if (r3 != r6) goto L_0x08d4
            r3 = r93
            if (r3 == r6) goto L_0x08d6
        L_0x08d4:
            r19 = r3
        L_0x08d6:
            throw r2     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x08d7:
            r0 = r88
            if (r1 != r0) goto L_0x0c5e
            long r20 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r9 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x08f5
            r90 = r0
        L_0x08f5:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x08fd
            r91 = r0
        L_0x08fd:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x0905
            r92 = r0
        L_0x0905:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x090d
            r93 = r0
        L_0x090d:
            byte r49 = r2.get()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            byte r0 = r2.get()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.position()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + 1
            r2.position(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r65 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r0 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r11.A08(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 <= r5) goto L_0x0960
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0960:
            r0 = r111
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 <= r5) goto L_0x096e
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
        L_0x096e:
            r0 = r110
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r108
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r106
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r103
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r102
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r11.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r115
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r116
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r111
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r110
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r108
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r106
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r103
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r3.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            int r50 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            r89.getPath()     // Catch:{ BufferOverflowException -> 0x0a1d, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0a2d
        L_0x0a1d:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x0a2d:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.txt"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x0a89
            java.nio.ByteBuffer r3 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r3 == 0) goto L_0x0ad4
            r2 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r2]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = r3.remaining()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r3.get(r1, r8, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1, r8, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r2 = r0.split(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r1 = r2.length     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7 = 0
            if (r1 <= 0) goto L_0x0ad4
            r4 = r2[r8]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r32
            if (r1 <= r0) goto L_0x0a75
            r3 = r2[r32]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r18
            if (r1 <= r0) goto L_0x0a76
            r7 = r2[r18]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x0a76
        L_0x0a75:
            r3 = r7
        L_0x0a76:
            if (r4 == 0) goto L_0x0a7c
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0a7c, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0a7c:
            if (r3 == 0) goto L_0x0a82
            int r19 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0a82, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0a82:
            if (r7 == 0) goto L_0x0ad4
            long r33 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0ad4, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0ad4
        L_0x0a89:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.bin"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x0ad4
            java.nio.ByteBuffer r2 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r2 == 0) goto L_0x0ad4
            r2.mark()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x0ab7
            r90 = r1
        L_0x0ab7:
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x0abf
            r91 = r1
        L_0x0abf:
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x0ac4, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0ad4
        L_0x0ac4:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x0ad4:
            r1 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0ade
            r1 = r9
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0ae0
        L_0x0ade:
            r33 = r1
        L_0x0ae0:
            r1 = r90
            if (r1 != r6) goto L_0x0ae8
            r1 = r92
            if (r1 == r6) goto L_0x0ae9
        L_0x0ae8:
            r5 = r1
        L_0x0ae9:
            r1 = r91
            if (r1 != r6) goto L_0x0af1
            r1 = r93
            if (r1 == r6) goto L_0x0af3
        L_0x0af1:
            r19 = r1
        L_0x0af3:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".subsecond"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x0b55
            java.nio.ByteBuffer r1 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x0b55
            r1.mark()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r28 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r1)     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r25 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r1)     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r14 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r39 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r37 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r35 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r51 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r53 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r55 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            long r57 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            int r67 = r1.getInt()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            int r68 = r1.getInt()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            r0.getPath()     // Catch:{ BufferOverflowException -> 0x0b4d, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0b55
        L_0x0b4d:
            r2 = move-exception
            java.lang.String r1 = "NightwatchParser"
            java.lang.String r0 = "could not parse sub second mmap"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x0b55:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".second"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7.<init>(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r0 = r7.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r0 == 0) goto L_0x13f2
            java.nio.ByteBuffer r4 = X.AnonymousClass0QE.A02(r7)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r4 == 0) goto L_0x13f2
            r4.mark()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r43 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r47 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r59 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r61 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r63 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r11.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r115
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r116
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r1 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = 305419896(0x12345678, float:5.6904566E-28)
            if (r1 != r0) goto L_0x0c4f
            int r1 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x0bd5
            int r72 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r73 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r74 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r75 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0bd5:
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x0bea
            r0 = r107
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r105
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r119
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0bea:
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x0c04
            r0 = r104
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r118
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r101
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r98
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0c04:
            int r22 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            if (r22 <= 0) goto L_0x0c59
            int r31 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r31
            if (r0 == r6) goto L_0x0c59
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r30 = r0
            int r76 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r77 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r45 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r41 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r3 = 0
        L_0x0c29:
            X.0QD r2 = new X.0QD     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r2.<init>()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r2.A00 = r0     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r2.A01 = r0     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r2.A02 = r0     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r2.A03 = r0     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            r30[r3] = r2     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r3 = r3 + 1
            r0 = r22
            if (r3 >= r0) goto L_0x0c59
            goto L_0x0c29
        L_0x0c4f:
            int r0 = r4.position()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + -4
            r4.position(r0)     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x0c04
        L_0x0c59:
            r7.getPath()     // Catch:{ BufferOverflowException -> 0x134d, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x13f2
        L_0x0c5e:
            r0 = 9
            if (r1 != r0) goto L_0x0f30
            r16 = -1
            long r20 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ all -> 0x0f0d }
            long r12 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r23 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r9 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            if (r0 == r5) goto L_0x0c7e
            r90 = r0
        L_0x0c7e:
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            if (r0 == r5) goto L_0x0c86
            r91 = r0
        L_0x0c86:
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            if (r0 == r5) goto L_0x0c8e
            r92 = r0
        L_0x0c8e:
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            if (r0 == r5) goto L_0x0c96
            r93 = r0
        L_0x0c96:
            long r28 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r78 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r2)     // Catch:{ all -> 0x0f0d }
            long r25 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r69 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r2)     // Catch:{ all -> 0x0f0d }
            long r14 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r39 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r37 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r35 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r51 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r53 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r55 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r57 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            int r67 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r68 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            byte r27 = r2.get()     // Catch:{ all -> 0x0f0d }
            byte r0 = r2.get()     // Catch:{ all -> 0x0f0d }
            short r1 = (short) r0     // Catch:{ all -> 0x0f0d }
            r0 = r113
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r121
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r0 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r11.A08(r0)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r122
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r120
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r112
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            if (r1 <= r5) goto L_0x0d18
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ all -> 0x0f0d }
        L_0x0d18:
            r0 = r111
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            if (r1 <= r5) goto L_0x0d26
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ all -> 0x0f0d }
        L_0x0d26:
            r0 = r110
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            long r43 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r47 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r59 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r61 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r63 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r11.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r122
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r121
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r113
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r120
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r112
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r115
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r116
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r111
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r110
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r109
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r99
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            byte r49 = r2.get()     // Catch:{ all -> 0x0f0d }
            int r0 = r2.position()     // Catch:{ all -> 0x0f0d }
            int r0 = r0 + 1
            r2.position(r0)     // Catch:{ all -> 0x0f0d }
            short r65 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r109
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r3 = r108
            r3.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r3 = r106
            r3.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r3 = r103
            r3.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r3 = r102
            r3.A04(r0)     // Catch:{ all -> 0x0f0d }
            r0 = r108
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r106
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r103
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r3.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r99
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            int r50 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            short r6 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            short r1 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r94
            r0.A08(r1)     // Catch:{ all -> 0x0f0d }
            r0 = r114
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r94
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r100
            r0.A00(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r97
            r0.A00(r2)     // Catch:{ all -> 0x0f0d }
            int r1 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            r0 = 305419896(0x12345678, float:5.6904566E-28)
            if (r1 != r0) goto L_0x0ee0
            int r3 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r0 = r2.remaining()     // Catch:{ all -> 0x0f0d }
            if (r0 <= r3) goto L_0x0e1e
            int r72 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r73 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r74 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r75 = r2.getInt()     // Catch:{ all -> 0x0f0d }
        L_0x0e1e:
            int r0 = r2.remaining()     // Catch:{ all -> 0x0f0d }
            if (r0 <= r3) goto L_0x0e6b
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r4 = r115
            r4.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r4 = r116
            r4.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r4 = r107
            r4.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r4 = r105
            r4.A04(r0)     // Catch:{ all -> 0x0f0d }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r0 = (long) r0     // Catch:{ all -> 0x0f0d }
            r4 = r119
            r4.A04(r0)     // Catch:{ all -> 0x0f0d }
            short r80 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            short r81 = r2.getShort()     // Catch:{ all -> 0x0f0d }
            r0 = r107
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r105
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r4.A06(r2)     // Catch:{ all -> 0x0f0d }
        L_0x0e6b:
            int r0 = r2.remaining()     // Catch:{ all -> 0x0f0d }
            if (r0 <= r3) goto L_0x0e7b
            r0 = r96
            r0.A00(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r95
            r0.A00(r2)     // Catch:{ all -> 0x0f0d }
        L_0x0e7b:
            int r0 = r2.remaining()     // Catch:{ all -> 0x0f0d }
            if (r0 <= r3) goto L_0x0e95
            r0 = r104
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r118
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r101
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
            r0 = r98
            r0.A06(r2)     // Catch:{ all -> 0x0f0d }
        L_0x0e95:
            int r22 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            if (r22 <= 0) goto L_0x0eea
            int r31 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            r0 = r31
            if (r0 == r5) goto L_0x0eea
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ all -> 0x0f0d }
            r30 = r0
            int r76 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            int r77 = r2.getInt()     // Catch:{ all -> 0x0f0d }
            long r45 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            long r41 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r4 = 0
        L_0x0eba:
            X.0QD r3 = new X.0QD     // Catch:{ all -> 0x0f0d }
            r3.<init>()     // Catch:{ all -> 0x0f0d }
            long r0 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r3.A00 = r0     // Catch:{ all -> 0x0f0d }
            long r0 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r3.A01 = r0     // Catch:{ all -> 0x0f0d }
            long r0 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r3.A02 = r0     // Catch:{ all -> 0x0f0d }
            long r0 = r2.getLong()     // Catch:{ all -> 0x0f0d }
            r3.A03 = r0     // Catch:{ all -> 0x0f0d }
            r30[r4] = r3     // Catch:{ all -> 0x0f0d }
            int r4 = r4 + 1
            r0 = r22
            if (r4 >= r0) goto L_0x0eea
            goto L_0x0eba
        L_0x0ee0:
            int r0 = r2.position()     // Catch:{ all -> 0x0f0d }
            int r0 = r0 + -4
            r2.position(r0)     // Catch:{ all -> 0x0f0d }
            goto L_0x0e95
        L_0x0eea:
            r1 = r12
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0ef4
            r1 = r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0ef6
        L_0x0ef4:
            r33 = r1
        L_0x0ef6:
            r1 = r90
            if (r1 != r5) goto L_0x0efe
            r1 = r92
            if (r1 == r5) goto L_0x0eff
        L_0x0efe:
            r5 = r1
        L_0x0eff:
            r2 = r91
            r0 = r19
            if (r2 != r0) goto L_0x0f09
            r2 = r93
            if (r2 == r0) goto L_0x13f2
        L_0x0f09:
            r19 = r2
            goto L_0x13f2
        L_0x0f0d:
            r2 = move-exception
            r3 = r12
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0f18
            r3 = r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0f1a
        L_0x0f18:
            r33 = r3
        L_0x0f1a:
            r1 = r90
            if (r1 != r5) goto L_0x0f22
            r1 = r92
            if (r1 == r5) goto L_0x0f23
        L_0x0f22:
            r5 = r1
        L_0x0f23:
            r3 = r91
            r0 = r19
            if (r3 != r0) goto L_0x0f2d
            r3 = r93
            if (r3 == r0) goto L_0x0f2f
        L_0x0f2d:
            r19 = r3
        L_0x0f2f:
            throw r2     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x0f30:
            r0 = 10
            if (r1 != r0) goto L_0x135f
            long r20 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            X.AnonymousClass0Q5.A08 = r20     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r9 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x0f4e
            r90 = r0
        L_0x0f4e:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x0f56
            r91 = r0
        L_0x0f56:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x0f5e
            r92 = r0
        L_0x0f5e:
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 == r5) goto L_0x0f66
            r93 = r0
        L_0x0f66:
            byte r49 = r2.get()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            byte r0 = r2.get()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.position()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + 1
            r2.position(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r65 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r0 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r11.A08(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 <= r5) goto L_0x0fb9
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0fb9:
            r0 = r111
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 <= r5) goto L_0x0fc7
            int r0 = r1 << 10
            short r1 = (short) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
        L_0x0fc7:
            r0 = r110
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r108
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r106
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r103
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r102
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r11.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r113
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r115
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r116
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r111
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r110
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r109
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r108
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r106
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r103
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r99
            r0.A06(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r50 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r6 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r1 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A08(r1)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r100
            r0.A00(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r97
            r0.A00(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.remaining()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= 0) goto L_0x10c6
            r0 = r107
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r105
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r119
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r115
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r116
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r107
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r105
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = (long) r0     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r3 = r119
            r3.A04(r0)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r80 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            short r81 = r2.getShort()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
        L_0x10c6:
            int r0 = r2.remaining()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= 0) goto L_0x10d6
            r0 = r96
            r0.A00(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r95
            r0.A00(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
        L_0x10d6:
            int r0 = r2.remaining()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= 0) goto L_0x10f0
            r0 = r104
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r118
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r101
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r98
            r0.A07(r2)     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
        L_0x10f0:
            r89.getPath()     // Catch:{ BufferOverflowException -> 0x10f4, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x1104
        L_0x10f4:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x1104:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.txt"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x1160
            java.nio.ByteBuffer r3 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r3 == 0) goto L_0x11ab
            r2 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r2]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = r3.remaining()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r3.get(r1, r8, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1, r8, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r2 = r0.split(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r1 = r2.length     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7 = 0
            if (r1 <= 0) goto L_0x11ab
            r4 = r2[r8]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r32
            if (r1 <= r0) goto L_0x114c
            r3 = r2[r32]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r18
            if (r1 <= r0) goto L_0x114d
            r7 = r2[r18]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x114d
        L_0x114c:
            r3 = r7
        L_0x114d:
            if (r4 == 0) goto L_0x1153
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x1153, IOException | BufferOverflowException -> 0x13c2 }
        L_0x1153:
            if (r3 == 0) goto L_0x1159
            int r19 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x1159, IOException | BufferOverflowException -> 0x13c2 }
        L_0x1159:
            if (r7 == 0) goto L_0x11ab
            long r33 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x11ab, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x11ab
        L_0x1160:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".watcher.bin"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x11ab
            java.nio.ByteBuffer r2 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r2 == 0) goto L_0x11ab
            r2.mark()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            long r12 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            long r23 = r2.getLong()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x118e
            r90 = r1
        L_0x118e:
            int r1 = r2.getInt()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            if (r1 == r5) goto L_0x1196
            r91 = r1
        L_0x1196:
            byte r27 = r2.get()     // Catch:{ BufferOverflowException -> 0x119b, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x11ab
        L_0x119b:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r87
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x11ab:
            r1 = r12
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x11b5
            r1 = r9
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x11b7
        L_0x11b5:
            r33 = r1
        L_0x11b7:
            r2 = r90
            r0 = r67
            if (r2 != r0) goto L_0x11c1
            r2 = r92
            if (r2 == r0) goto L_0x11c2
        L_0x11c1:
            r5 = r2
        L_0x11c2:
            r2 = r91
            if (r2 != r0) goto L_0x11ca
            r2 = r93
            if (r2 == r0) goto L_0x11cc
        L_0x11ca:
            r19 = r2
        L_0x11cc:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".subsecond"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r1 = r0.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x1236
            java.nio.ByteBuffer r1 = X.AnonymousClass0QE.A02(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r1 == 0) goto L_0x1236
            r1.mark()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r28 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r78 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r66 = X.AnonymousClass0QE.A01(r1)     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r25 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r69 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            java.lang.String r71 = X.AnonymousClass0Q5.A00(r1)     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r14 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r39 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r37 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r35 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r51 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r53 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r55 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            long r57 = r1.getLong()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            int r67 = r1.getInt()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            int r68 = r1.getInt()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            r0.getPath()     // Catch:{ BufferOverflowException -> 0x122e, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x1236
        L_0x122e:
            r2 = move-exception
            java.lang.String r1 = "NightwatchParser"
            java.lang.String r0 = "could not parse sub second mmap"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x1236:
            java.lang.String r1 = r89.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = ".second"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7.<init>(r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            boolean r0 = r7.exists()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r0 == 0) goto L_0x13f2
            java.nio.ByteBuffer r4 = X.AnonymousClass0QE.A02(r7)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            if (r4 == 0) goto L_0x13f2
            r4.mark()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r43 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r47 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r59 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r61 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r63 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r11.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r122
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r121
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r114
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r120
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r94
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r112
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r115
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r116
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r1 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = 305419896(0x12345678, float:5.6904566E-28)
            if (r1 != r0) goto L_0x1332
            int r1 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x12b6
            int r72 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r73 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r74 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r75 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
        L_0x12b6:
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x12cb
            r0 = r107
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r105
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r119
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
        L_0x12cb:
            int r0 = r4.remaining()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            if (r0 <= r1) goto L_0x12e5
            r0 = r104
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r118
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r101
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r0 = r98
            r0.A05(r4)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
        L_0x12e5:
            int r22 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            if (r22 <= 0) goto L_0x133c
            int r31 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r1 = r31
            r0 = r76
            if (r1 == r0) goto L_0x133c
            r0 = r22
            X.0QD[] r0 = new X.AnonymousClass0QD[r0]     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r30 = r0
            int r76 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r77 = r4.getInt()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r45 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r41 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r3 = 0
        L_0x130c:
            X.0QD r2 = new X.0QD     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r2.<init>()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r2.A00 = r0     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r2.A01 = r0     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r2.A02 = r0     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            long r0 = r4.getLong()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r2.A03 = r0     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            r30[r3] = r2     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r3 = r3 + 1
            r0 = r22
            if (r3 >= r0) goto L_0x133c
            goto L_0x130c
        L_0x1332:
            int r0 = r4.position()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            int r0 = r0 + -4
            r4.position(r0)     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x12e5
        L_0x133c:
            r7.getPath()     // Catch:{ BufferOverflowException -> 0x1341, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x13f2
        L_0x1341:
            r1 = move-exception
            java.lang.String r0 = "NightwatchParser"
            java.lang.String r2 = r7.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x1358
        L_0x134d:
            r1 = move-exception
            java.lang.String r0 = "NightwatchParser"
            java.lang.String r2 = r7.getPath()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
        L_0x1358:
            r2 = r87
            X.AnonymousClass0LU.A0K(r0, r2, r1, r3)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x13f2
        L_0x135f:
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = "unsupported nightwatch format %s, version:%d"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1}     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            X.AnonymousClass0LU.A0N(r2, r0, r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x141e
        L_0x1370:
            r2.reset()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r3 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r3]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = r2.remaining()     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r0 = java.lang.Math.min(r3, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r2.get(r1, r8, r0)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0.<init>(r1, r8, r3)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r2 = r0.split(r1)     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            int r1 = r2.length     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r7 = 0
            if (r1 <= 0) goto L_0x13f2
            r4 = r2[r8]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r32
            if (r1 <= r0) goto L_0x13a0
            r3 = r2[r32]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            r0 = r18
            if (r1 <= r0) goto L_0x13a1
            r7 = r2[r18]     // Catch:{ IOException | BufferOverflowException -> 0x13c2, BufferUnderflowException -> 0x13b4 }
            goto L_0x13a1
        L_0x13a0:
            r3 = r7
        L_0x13a1:
            if (r4 == 0) goto L_0x13a7
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x13a7, IOException | BufferOverflowException -> 0x13c2 }
        L_0x13a7:
            if (r3 == 0) goto L_0x13ad
            int r19 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x13ad, IOException | BufferOverflowException -> 0x13c2 }
        L_0x13ad:
            if (r7 == 0) goto L_0x13f2
            long r33 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x13f2, IOException | BufferOverflowException -> 0x13c2 }
            goto L_0x13f2
        L_0x13b4:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r89.getPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "failed to parse nighwatch log file %s"
            goto L_0x13cf
        L_0x13c2:
            r3 = move-exception
            java.lang.String r2 = "NightwatchParser"
            java.lang.String r0 = r89.getPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = r87
        L_0x13cf:
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)
            goto L_0x13f2
        L_0x13d3:
            r1 = r12
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x13dd
            r1 = r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x13df
        L_0x13dd:
            r33 = r1
        L_0x13df:
            r1 = r90
            if (r1 != r5) goto L_0x13e7
            r1 = r92
            if (r1 == r5) goto L_0x13e8
        L_0x13e7:
            r5 = r1
        L_0x13e8:
            r2 = r91
            if (r2 != r6) goto L_0x13f0
            r2 = r93
            if (r2 == r6) goto L_0x13f2
        L_0x13f0:
            r19 = r2
        L_0x13f2:
            r0 = r88
            long[] r2 = new long[r0]
            r2[r8] = r33
            r2[r32] = r25
            r2[r18] = r28
            r3 = 3
            long r0 = r11.A02
            r2[r3] = r0
            r3 = 4
            r0 = r122
            long r0 = r0.A02
            r2[r3] = r0
            r0 = r120
            long r0 = r0.A02
            r2[r84] = r0
            r0 = r114
            long r0 = r0.A02
            r2[r85] = r0
            r0 = r121
            long r0 = r0.A02
            r2[r86] = r0
            long r33 = X.AnonymousClass0QE.A00(r2)
        L_0x141e:
            X.0ND r84 = X.AnonymousClass0ND.CRITICAL_REPORT
            r2 = 0
            r1 = r84
            r0 = r124
            if (r0 != r1) goto L_0x1428
            r2 = 1
        L_0x1428:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r1 = -1
            if (r5 <= r1) goto L_0x1439
            X.0ON r0 = X.AnonymousClass0MU.A7K
            java.lang.String r3 = java.lang.String.valueOf(r5)
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x1439:
            r0 = r19
            if (r0 <= r1) goto L_0x1446
            X.0ON r3 = X.AnonymousClass0MU.A7J
            java.lang.String r0 = java.lang.String.valueOf(r19)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1446:
            r18 = -1
            int r0 = (r33 > r18 ? 1 : (r33 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x1455
            X.0ON r3 = X.AnonymousClass0MU.A6x
            java.lang.String r0 = java.lang.String.valueOf(r33)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1455:
            if (r83 == 0) goto L_0x190f
            r0 = r90
            if (r0 <= r1) goto L_0x1464
            X.0ON r3 = X.AnonymousClass0MU.A71
            java.lang.String r0 = java.lang.String.valueOf(r90)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1464:
            r0 = r91
            if (r0 <= r1) goto L_0x1471
            X.0ON r3 = X.AnonymousClass0MU.A70
            java.lang.String r0 = java.lang.String.valueOf(r91)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1471:
            r16 = 0
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x1480
            X.0ON r3 = X.AnonymousClass0MU.A6y
            java.lang.String r0 = java.lang.String.valueOf(r12)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1480:
            int r0 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x148d
            X.0ON r3 = X.AnonymousClass0MU.A6z
            java.lang.String r0 = java.lang.String.valueOf(r23)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x148d:
            r0 = r92
            if (r0 <= r1) goto L_0x149a
            X.0ON r3 = X.AnonymousClass0MU.A7T
            java.lang.String r0 = java.lang.String.valueOf(r92)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x149a:
            r0 = r93
            if (r0 <= r1) goto L_0x14a7
            X.0ON r3 = X.AnonymousClass0MU.A7S
            java.lang.String r0 = java.lang.String.valueOf(r93)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x14a7:
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x14b4
            X.0ON r0 = X.AnonymousClass0MU.A7P
            java.lang.String r3 = java.lang.String.valueOf(r9)
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14b4:
            int r0 = (r69 > r18 ? 1 : (r69 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1506
            r0 = r6 & 1
            java.lang.String r3 = "true"
            if (r0 == 0) goto L_0x14c3
            X.0ON r0 = X.AnonymousClass0MU.A7H
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14c3:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x14cc
            X.0ON r0 = X.AnonymousClass0MU.A7C
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14cc:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x14d5
            X.0ON r0 = X.AnonymousClass0MU.A7R
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14d5:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x14de
            X.0ON r0 = X.AnonymousClass0MU.A7Q
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14de:
            r0 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x14e8
            X.0ON r0 = X.AnonymousClass0MU.A7I
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14e8:
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x14f2
            X.0ON r0 = X.AnonymousClass0MU.A7D
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14f2:
            r0 = 144(0x90, float:2.02E-43)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x14fc
            X.0ON r0 = X.AnonymousClass0MU.A76
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x14fc:
            r0 = 288(0x120, float:4.04E-43)
            r6 = r6 & r0
            if (r6 == 0) goto L_0x1506
            X.0ON r0 = X.AnonymousClass0MU.A75
            X.AnonymousClass0QE.A03(r0, r3, r7)
        L_0x1506:
            if (r65 <= 0) goto L_0x1511
            X.0ON r3 = X.AnonymousClass0MU.A79
            java.lang.String r0 = java.lang.String.valueOf(r65)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1511:
            int r0 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x151e
            X.0ON r3 = X.AnonymousClass0MU.A7A
            java.lang.String r0 = java.lang.String.valueOf(r28)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x151e:
            int r0 = (r78 > r16 ? 1 : (r78 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x152b
            X.0ON r3 = X.AnonymousClass0MU.A7B
            java.lang.String r0 = java.lang.String.valueOf(r78)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x152b:
            r0 = r27
            if (r0 == r1) goto L_0x1538
            X.0ON r3 = X.AnonymousClass0MU.A77
            java.lang.String r0 = java.lang.String.valueOf(r27)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1538:
            boolean r0 = r66.isEmpty()
            if (r0 != 0) goto L_0x1545
            X.0ON r3 = X.AnonymousClass0MU.A78
            r0 = r66
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1545:
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x1552
            X.0ON r3 = X.AnonymousClass0MU.A7F
            java.lang.String r0 = java.lang.String.valueOf(r25)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1552:
            int r0 = (r69 > r16 ? 1 : (r69 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x155f
            X.0ON r3 = X.AnonymousClass0MU.A7G
            java.lang.String r0 = java.lang.String.valueOf(r69)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x155f:
            boolean r0 = r71.isEmpty()
            if (r0 != 0) goto L_0x156c
            X.0ON r3 = X.AnonymousClass0MU.A7E
            r0 = r71
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x156c:
            if (r2 != 0) goto L_0x1613
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x157b
            X.0ON r3 = X.AnonymousClass0MU.A73
            java.lang.String r0 = java.lang.String.valueOf(r14)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x157b:
            int r0 = (r39 > r16 ? 1 : (r39 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x1588
            X.0ON r3 = X.AnonymousClass0MU.A6v
            java.lang.String r0 = java.lang.String.valueOf(r39)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1588:
            int r0 = (r37 > r16 ? 1 : (r37 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x1595
            X.0ON r3 = X.AnonymousClass0MU.A74
            java.lang.String r0 = java.lang.String.valueOf(r37)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1595:
            int r0 = (r35 > r16 ? 1 : (r35 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x15a2
            X.0ON r3 = X.AnonymousClass0MU.A6w
            java.lang.String r0 = java.lang.String.valueOf(r35)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15a2:
            int r0 = (r51 > r16 ? 1 : (r51 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x15af
            X.0ON r3 = X.AnonymousClass0MU.A7L
            java.lang.String r0 = java.lang.String.valueOf(r51)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15af:
            int r0 = (r53 > r16 ? 1 : (r53 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x15bc
            X.0ON r3 = X.AnonymousClass0MU.A7N
            java.lang.String r0 = java.lang.String.valueOf(r53)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15bc:
            int r0 = (r55 > r16 ? 1 : (r55 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x15c9
            X.0ON r3 = X.AnonymousClass0MU.A7M
            java.lang.String r0 = java.lang.String.valueOf(r55)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15c9:
            int r0 = (r57 > r16 ? 1 : (r57 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x15d6
            X.0ON r3 = X.AnonymousClass0MU.A7O
            java.lang.String r0 = java.lang.String.valueOf(r57)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15d6:
            if (r68 <= 0) goto L_0x15e1
            X.0ON r3 = X.AnonymousClass0MU.A72
            java.lang.String r0 = java.lang.String.valueOf(r68)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15e1:
            if (r67 <= 0) goto L_0x15ec
            X.0ON r3 = X.AnonymousClass0MU.A6u
            java.lang.String r0 = java.lang.String.valueOf(r67)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15ec:
            int r0 = (r59 > r18 ? 1 : (r59 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x15f9
            X.0ON r3 = X.AnonymousClass0MU.A7W
            java.lang.String r0 = java.lang.String.valueOf(r59)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x15f9:
            int r0 = (r61 > r18 ? 1 : (r61 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1606
            X.0ON r3 = X.AnonymousClass0MU.A7X
            java.lang.String r0 = java.lang.String.valueOf(r61)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1606:
            int r0 = (r63 > r16 ? 1 : (r63 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x1613
            X.0ON r3 = X.AnonymousClass0MU.A7Y
            java.lang.String r0 = java.lang.String.valueOf(r63)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1613:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1620
            X.0ON r3 = X.AnonymousClass0MU.A7d
            java.lang.String r0 = java.lang.String.valueOf(r20)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1620:
            r0 = r49
            if (r0 == r1) goto L_0x162d
            X.0ON r3 = X.AnonymousClass0MU.A7e
            java.lang.String r0 = java.lang.String.valueOf(r49)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x162d:
            int r0 = (r43 > r18 ? 1 : (r43 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x163a
            X.0ON r3 = X.AnonymousClass0MU.A7U
            java.lang.String r0 = java.lang.String.valueOf(r43)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x163a:
            int r0 = (r47 > r18 ? 1 : (r47 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1647
            X.0ON r3 = X.AnonymousClass0MU.A7V
            java.lang.String r0 = java.lang.String.valueOf(r47)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x1647:
            r0 = 6
            long[] r0 = new long[r0]
            r0[r8] = r12
            r0[r32] = r28
            r3 = 2
            r0[r3] = r25
            r3 = 3
            r0[r3] = r14
            r3 = 4
            r0[r3] = r39
            r4 = 5
            r0[r4] = r43
            long r5 = X.AnonymousClass0QE.A00(r0)
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x166b
            X.0ON r3 = X.AnonymousClass0MU.A7Z
            java.lang.String r0 = java.lang.String.valueOf(r5)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x166b:
            long[] r0 = new long[r4]
            r0[r8] = r23
            r0[r32] = r37
            r3 = 2
            r0[r3] = r35
            r3 = 3
            r0[r3] = r45
            r3 = 4
            r0[r3] = r47
            long r4 = X.AnonymousClass0QE.A00(r0)
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x168b
            X.0ON r3 = X.AnonymousClass0MU.A7a
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.AnonymousClass0QE.A03(r3, r0, r7)
        L_0x168b:
            r0 = r2 ^ 1
            r11.A09(r2, r0, r7)
            r3 = r122
            r3.A09(r2, r0, r7)
            r3 = r114
            r3.A09(r2, r0, r7)
            r3 = r121
            r3.A09(r2, r0, r7)
            r3 = r113
            r3.A09(r2, r0, r7)
            r3 = r120
            r3.A09(r2, r0, r7)
            r3 = r112
            r3.A09(r2, r0, r7)
            r3 = r115
            r3.A09(r2, r0, r7)
            r3 = r116
            r3.A09(r2, r0, r7)
            r3 = r111
            r3.A09(r2, r0, r7)
            r3 = r110
            r3.A09(r2, r0, r7)
            r3 = r109
            r3.A09(r2, r0, r7)
            r3 = r108
            r3.A09(r2, r0, r7)
            r3 = r106
            r3.A09(r2, r0, r7)
            r3 = r103
            r3.A09(r2, r0, r7)
            r3 = r102
            r3.A09(r2, r0, r7)
            r3 = r99
            r3.A09(r2, r0, r7)
            r3 = r94
            r3.A09(r2, r0, r7)
            r3 = r107
            r3.A09(r2, r0, r7)
            r3 = r105
            r3.A09(r2, r0, r7)
            r3 = r119
            r3.A09(r2, r0, r7)
            r3 = r104
            r3.A09(r2, r0, r7)
            r3 = r118
            r3.A09(r2, r0, r7)
            r3 = r101
            r3.A09(r2, r0, r7)
            r3 = r98
            r3.A09(r2, r0, r7)
            if (r2 != 0) goto L_0x1734
            r0 = r100
            r0.A01(r7)
            r0 = r97
            r0.A01(r7)
            r0 = r96
            r0.A01(r7)
            r0 = r95
            r0.A01(r7)
            if (r80 <= 0) goto L_0x1729
            X.0ON r2 = X.AnonymousClass0MU.A7b
            java.lang.String r0 = java.lang.String.valueOf(r80)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x1729:
            if (r81 <= 0) goto L_0x1734
            X.0ON r2 = X.AnonymousClass0MU.A7c
            java.lang.String r0 = java.lang.String.valueOf(r81)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x1734:
            r0 = r115
            java.util.List r2 = r0.A05
            boolean r0 = r2.isEmpty()
            r9 = -1
            if (r0 != 0) goto L_0x1758
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r2 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x1758
            r9 = r4
        L_0x1758:
            r0 = r116
            java.util.List r2 = r0.A05
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1793
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r2 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x1793
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x1793
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x1793
            X.0ON r2 = X.AnonymousClass0MU.A61
            java.lang.String r0 = java.lang.String.valueOf(r9)
            X.AnonymousClass0QE.A03(r2, r0, r7)
            X.0ON r2 = X.AnonymousClass0MU.A60
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x1793:
            boolean r0 = r117.isEmpty()
            if (r0 != 0) goto L_0x17a0
            X.0ON r2 = X.AnonymousClass0MU.A8O
            r0 = r117
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17a0:
            r0 = r50
            if (r0 == r1) goto L_0x17ad
            X.0ON r2 = X.AnonymousClass0MU.A95
            java.lang.String r0 = java.lang.String.valueOf(r50)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17ad:
            if (r72 <= 0) goto L_0x17b8
            X.0ON r2 = X.AnonymousClass0MU.A8b
            java.lang.String r0 = java.lang.String.valueOf(r72)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17b8:
            if (r73 <= 0) goto L_0x17c3
            X.0ON r2 = X.AnonymousClass0MU.A8Z
            java.lang.String r0 = java.lang.String.valueOf(r73)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17c3:
            if (r74 <= 0) goto L_0x17ce
            X.0ON r2 = X.AnonymousClass0MU.A8a
            java.lang.String r0 = java.lang.String.valueOf(r74)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17ce:
            if (r75 <= 0) goto L_0x17d9
            X.0ON r2 = X.AnonymousClass0MU.A8c
            java.lang.String r0 = java.lang.String.valueOf(r75)
            X.AnonymousClass0QE.A03(r2, r0, r7)
        L_0x17d9:
            if (r30 == 0) goto L_0x190f
            if (r31 < 0) goto L_0x190f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x1900 }
            r6.<init>()     // Catch:{ JSONException -> 0x1900 }
            java.lang.String r0 = "tickInfoCount"
            r2 = r22
            r6.put(r0, r2)     // Catch:{ JSONException -> 0x1900 }
            r0 = r76
            if (r0 == r1) goto L_0x17f2
            java.lang.String r2 = "tickInfoTotalUpdateIntervalUptimeS"
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x17f2:
            r0 = r77
            if (r0 == r1) goto L_0x17fb
            java.lang.String r1 = "tickInfoUpdateCount"
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x17fb:
            int r0 = (r45 > r18 ? 1 : (r45 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1806
            java.lang.String r2 = "tickInfoNextExpectedUptimeMs"
            r0 = r45
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x1806:
            java.lang.String r2 = "nightwatchChecksum"
            r0 = r41
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            java.lang.String r1 = "dumpUptimeMs"
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ JSONException -> 0x1900 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x1900 }
            r0 = r31
            long r0 = (long) r0     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 + r16
            r9 = 31
            long r0 = r0 * r9
            r4 = r30[r31]     // Catch:{ JSONException -> 0x1900 }
            long r2 = r4.A00     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 + r2
            long r0 = r0 * r9
            long r2 = r4.A01     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 + r2
            long r0 = r0 * r9
            long r2 = r4.A02     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 + r2
            long r0 = r0 * r9
            long r2 = r4.A03     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 + r2
            java.lang.String r2 = "expectedChecksum"
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            java.lang.String r2 = "checksumMatches"
            int r3 = (r0 > r41 ? 1 : (r0 == r41 ? 0 : -1))
            r0 = 0
            if (r3 != 0) goto L_0x183c
            r0 = 1
        L_0x183c:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x1900 }
            r6.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            org.json.JSONArray r49 = new org.json.JSONArray     // Catch:{ JSONException -> 0x1900 }
            r49.<init>()     // Catch:{ JSONException -> 0x1900 }
            r10 = 0
            r5 = 0
        L_0x184b:
            java.lang.String r42 = "relativeThreadTimeMs"
            java.lang.String r41 = "delayMs"
            java.lang.String r27 = "nextExpectedUptimeMs"
            java.lang.String r18 = "actualUptimeMs"
            r0 = r22
            if (r5 >= r0) goto L_0x18a0
            int r0 = r31 + 1
            int r0 = r0 + r5
            int r0 = r0 % r22
            r9 = r30[r0]     // Catch:{ JSONException -> 0x1900 }
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x189d
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            long r10 = java.lang.Math.max(r0, r10)     // Catch:{ JSONException -> 0x1900 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x1900 }
            r4.<init>()     // Catch:{ JSONException -> 0x1900 }
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            r2 = r18
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            long r2 = r9.A01     // Catch:{ JSONException -> 0x1900 }
            r18 = -1
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x1886
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 - r2
            r2 = r41
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x1886:
            long r0 = r9.A02     // Catch:{ JSONException -> 0x1900 }
            r2 = r27
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            long r0 = r9.A03     // Catch:{ JSONException -> 0x1900 }
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x1898
            r2 = r42
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x1898:
            r0 = r49
            r0.put(r4)     // Catch:{ JSONException -> 0x1900 }
        L_0x189d:
            int r5 = r5 + 1
            goto L_0x184b
        L_0x18a0:
            if (r82 == 0) goto L_0x18e8
            r5 = 0
        L_0x18a3:
            r0 = r82
            int r0 = r0.length     // Catch:{ JSONException -> 0x1900 }
            if (r5 >= r0) goto L_0x18e8
            r0 = r82[r5]     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0.A00     // Catch:{ JSONException -> 0x1900 }
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x18e5
            r9 = r82[r5]     // Catch:{ JSONException -> 0x1900 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x1900 }
            r4.<init>()     // Catch:{ JSONException -> 0x1900 }
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            r2 = r18
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            long r2 = r9.A01     // Catch:{ JSONException -> 0x1900 }
            r16 = -1
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x18ce
            long r0 = r9.A00     // Catch:{ JSONException -> 0x1900 }
            long r0 = r0 - r2
            r2 = r41
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x18ce:
            long r0 = r9.A02     // Catch:{ JSONException -> 0x1900 }
            r2 = r27
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
            long r0 = r9.A03     // Catch:{ JSONException -> 0x1900 }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x18e0
            r2 = r42
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x1900 }
        L_0x18e0:
            r0 = r49
            r0.put(r4)     // Catch:{ JSONException -> 0x1900 }
        L_0x18e5:
            int r5 = r5 + 1
            goto L_0x18a3
        L_0x18e8:
            java.lang.String r1 = "tickInfos"
            r0 = r49
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x1900 }
            java.lang.String r1 = "source"
            java.lang.String r0 = "UFAD mmap"
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x1900 }
            X.0ON r0 = X.AnonymousClass0MU.A8d     // Catch:{ JSONException -> 0x1900 }
            java.lang.String r1 = r6.toString()     // Catch:{ JSONException -> 0x1900 }
            X.AnonymousClass0QE.A03(r0, r1, r7)     // Catch:{ JSONException -> 0x1900 }
            goto L_0x190f
        L_0x1900:
            r2 = move-exception
            java.lang.String r1 = "NightwatchParser"
            java.lang.String r0 = "error serializing json"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            X.0ON r1 = X.AnonymousClass0MU.A8d
            java.lang.String r0 = "\"JSON error\""
            X.AnonymousClass0QE.A03(r1, r0, r7)
        L_0x190f:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x1917:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1949
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r1 = X.AnonymousClass0QE.A00
            java.lang.Object r1 = r1.get(r0)
            X.0ON r1 = (X.AnonymousClass0ON) r1
            if (r1 == 0) goto L_0x193d
            r0 = r125
            r0.A03(r1, r2)
            goto L_0x1917
        L_0x193d:
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "NightwatchCollector"
            java.lang.String r0 = "Undeclared field: %s"
            X.AnonymousClass0LU.A0O(r1, r0, r2)
            goto L_0x1917
        L_0x1949:
            r1 = r84
            r0 = r124
            if (r0 != r1) goto L_0x1a2b
            X.0Xz r2 = X.AnonymousClass0P0.A00(r123)
            if (r2 == 0) goto L_0x1a2b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r9 = -1
            int r0 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x1969
            X.0ON r0 = X.AnonymousClass0MU.A7d
            java.lang.String r3 = java.lang.String.valueOf(r20)
            X.AnonymousClass0QE.A03(r0, r3, r1)
        L_0x1969:
            int r0 = (r33 > r9 ? 1 : (r33 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x1976
            X.0ON r0 = X.AnonymousClass0MU.A6x
            java.lang.String r3 = java.lang.String.valueOf(r33)
            X.AnonymousClass0QE.A03(r0, r3, r1)
        L_0x1976:
            r0 = 6
            long[] r0 = new long[r0]
            r0[r8] = r12
            r0[r32] = r28
            r3 = 2
            r0[r3] = r25
            r3 = 3
            r0[r3] = r14
            r7 = 4
            r0[r7] = r39
            r3 = 5
            r0[r3] = r43
            long r5 = X.AnonymousClass0QE.A00(r0)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x199a
            X.0ON r4 = X.AnonymousClass0MU.A7Z
            java.lang.String r0 = java.lang.String.valueOf(r5)
            X.AnonymousClass0QE.A03(r4, r0, r1)
        L_0x199a:
            long[] r0 = new long[r3]
            r0[r8] = r23
            r0[r32] = r37
            r3 = 2
            r0[r3] = r35
            r3 = 3
            r0[r3] = r45
            r0[r7] = r47
            long r4 = X.AnonymousClass0QE.A00(r0)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x19b9
            X.0ON r3 = X.AnonymousClass0MU.A7a
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.AnonymousClass0QE.A03(r3, r0, r1)
        L_0x19b9:
            r4 = 0
            int r0 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x19c8
            X.0ON r3 = X.AnonymousClass0MU.A7F
            java.lang.String r0 = java.lang.String.valueOf(r25)
            X.AnonymousClass0QE.A03(r3, r0, r1)
        L_0x19c8:
            int r0 = (r69 > r4 ? 1 : (r69 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x19d5
            X.0ON r3 = X.AnonymousClass0MU.A7G
            java.lang.String r0 = java.lang.String.valueOf(r69)
            X.AnonymousClass0QE.A03(r3, r0, r1)
        L_0x19d5:
            boolean r0 = r71.isEmpty()
            if (r0 != 0) goto L_0x19e2
            X.0ON r3 = X.AnonymousClass0MU.A7E
            r0 = r71
            X.AnonymousClass0QE.A03(r3, r0, r1)
        L_0x19e2:
            r0 = r121
            r0.A09(r8, r8, r1)
            r0 = r120
            r0.A09(r8, r8, r1)
            r0 = r118
            r0.A09(r8, r8, r1)
            r0 = r122
            r0.A09(r8, r8, r1)
            r0 = r119
            r0.A09(r8, r8, r1)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x1a03:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1a2b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r0 = X.AnonymousClass0QE.A00
            java.lang.Object r1 = r0.get(r1)
            X.0MP r1 = (X.AnonymousClass0MP) r1
            if (r1 == 0) goto L_0x1a03
            if (r3 == 0) goto L_0x1a03
            r0 = r124
            r2.A00(r1, r0, r3)
            goto L_0x1a03
        L_0x1a2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RS.CWp(X.0Mn, X.0ND):void");
    }
}
