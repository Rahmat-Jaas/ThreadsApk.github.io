package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.boye.httpclientandroidlib.HttpHost;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;

/* renamed from: X.40u  reason: invalid class name and case insensitive filesystem */
public final class C678540u implements C16330sr {
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final void BkC(android.content.Context r21, android.content.Intent r22, android.content.Intent r23, X.C16300so r24, java.lang.Integer r25) {
        /*
            r20 = this;
            r19 = 1
            java.lang.Object r1 = X.C550131i.A01
            monitor-enter(r1)
            X.3Sq r7 = X.C550131i.A00     // Catch:{ all -> 0x02b8 }
            monitor-exit(r1)
            if (r7 == 0) goto L_0x02b7
            r8 = 0
            int r1 = r7.A00
            if (r1 <= 0) goto L_0x02b7
            java.util.Random r0 = r7.A03
            int r0 = r0.nextInt(r1)
            if (r0 != 0) goto L_0x02b7
            android.net.Uri r5 = r23.getData()
            if (r5 == 0) goto L_0x02b7
            java.lang.String r0 = r5.getAuthority()
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = r5.getScheme()
            if (r0 == 0) goto L_0x02b7
            java.lang.String r3 = r5.getScheme()
            r1 = 2
            if (r3 == 0) goto L_0x00cb
            java.lang.String r2 = "http"
            r0 = r19
            boolean r18 = X.C18220wO.A1V(r2, r0, r3)
            if (r18 != 0) goto L_0x00cd
            java.lang.String r4 = r5.getAuthority()
        L_0x003e:
            int r0 = r25.intValue()
            switch(r0) {
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00be;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c7;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r12 = "INTERNAL"
        L_0x0047:
            X.3FI r3 = r7.A01
            r9 = 3
            java.lang.String r2 = ""
            r6 = r4
            if (r4 != 0) goto L_0x0050
            r6 = r2
        L_0x0050:
            java.lang.String r0 = r5.getScheme()
            if (r0 != 0) goto L_0x0057
            r0 = r2
        L_0x0057:
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0, r12}
            java.util.Arrays.copyOf(r0, r9)
            java.util.List r0 = r7.A02
            r10 = 10
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r0, r10)
            java.util.Iterator r15 = r0.iterator()
        L_0x006a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d1
            r15.next()
            X.3AX r11 = X.AnonymousClass31G.A00
            if (r11 != 0) goto L_0x007d
            X.4l6 r11 = X.C80064l6.A00
        L_0x0079:
            r7.add(r11)
            goto L_0x006a
        L_0x007d:
            java.lang.String r13 = r11.A01
            r6 = 5
            int r0 = r13.length()
            if (r0 >= r6) goto L_0x00a8
            r13 = 0
        L_0x0087:
            java.lang.String r14 = r11.A02
            r6 = 4
            int r0 = r14.length()
            if (r0 >= r6) goto L_0x009b
            r14 = 0
        L_0x0091:
            java.lang.String r6 = r11.A00
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r11 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r11.<init>(r13, r14, r6, r0)
            goto L_0x0079
        L_0x009b:
            java.lang.String r6 = "(^|[^\\w])"
            java.lang.String r0 = "($|[^\\w])"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r6, r14, r0)
            X.7yC r14 = X.C18250wR.A0h(r0)
            goto L_0x0091
        L_0x00a8:
            java.lang.String r6 = "(^|[^0-9])"
            java.lang.String r0 = "($|[^0-9])"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r6, r13, r0)
            X.7yC r13 = X.C18250wR.A0h(r0)
            goto L_0x0087
        L_0x00b5:
            java.lang.String r12 = "SAME_KEY"
            goto L_0x0047
        L_0x00b8:
            java.lang.String r12 = "FAMILY"
            goto L_0x0047
        L_0x00bb:
            java.lang.String r12 = "TRUSTED_APP"
            goto L_0x0047
        L_0x00be:
            java.lang.String r12 = "ACCESSIBLE_BY_ANY_APP"
            goto L_0x0047
        L_0x00c1:
            java.lang.String r12 = "EXTERNAL"
            goto L_0x0047
        L_0x00c4:
            java.lang.String r12 = "THIRD_PARTY"
            goto L_0x0047
        L_0x00c7:
            java.lang.String r12 = "ANY"
            goto L_0x0047
        L_0x00cb:
            r18 = 1
        L_0x00cd:
            java.lang.String r4 = "--sanitized-authority--"
            goto L_0x003e
        L_0x00d1:
            java.util.List r0 = r5.getPathSegments()
            java.util.Iterator r6 = r0.iterator()
        L_0x00d9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = X.C18180wK.A0k(r6)
            X.22n r13 = X.C61293Sq.A00(r0, r7)
            if (r13 == 0) goto L_0x00d9
            goto L_0x00eb
        L_0x00ea:
            r13 = 0
        L_0x00eb:
            java.util.Set r15 = r5.getQueryParameterNames()     // Catch:{ UnsupportedOperationException -> 0x00f4 }
            if (r15 != 0) goto L_0x00f6
            X.84Y r15 = X.AnonymousClass84Y.A00     // Catch:{ UnsupportedOperationException -> 0x00f4 }
            goto L_0x00f6
        L_0x00f4:
            X.84Y r15 = X.AnonymousClass84Y.A00
        L_0x00f6:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x01d9
            X.4To r11 = X.AnonymousClass4To.A00()
        L_0x0100:
            if (r13 != 0) goto L_0x016a
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x016a
            r13 = 0
        L_0x0109:
            android.os.Bundle r14 = r23.getExtras()
            if (r14 != 0) goto L_0x013b
            X.4To r11 = X.AnonymousClass4To.A00()
        L_0x0113:
            if (r13 != 0) goto L_0x0207
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x01f9
            r1 = r4
            if (r4 != 0) goto L_0x011f
            r1 = r2
        L_0x011f:
            java.lang.String r0 = r5.getScheme()
            if (r0 != 0) goto L_0x0126
            r0 = r2
        L_0x0126:
            r3.A00(r1, r0, r8)
            if (r4 != 0) goto L_0x012c
            r4 = r2
        L_0x012c:
            java.lang.String r0 = r5.getScheme()
            if (r0 == 0) goto L_0x0133
            r2 = r0
        L_0x0133:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r2, r12}
            java.util.Arrays.copyOf(r0, r9)
            return
        L_0x013b:
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x0147:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r6 = r15.next()
            X.C04220Ms.A06(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r14.get(r6)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r0.toString()
            X.22n r0 = X.C61293Sq.A00(r0, r7)
            if (r0 == 0) goto L_0x0147
            r11.put(r6, r0)
            goto L_0x0147
        L_0x016a:
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r0 = r5.getScheme()
            android.net.Uri$Builder r14 = r6.scheme(r0)
            if (r18 == 0) goto L_0x01ca
            java.lang.String r0 = "--sanitized-authority--"
        L_0x017b:
            r14.authority(r0)
            if (r13 != 0) goto L_0x01bc
            java.lang.String r0 = "--sanitized--"
        L_0x0182:
            r14.path(r0)
            java.util.Iterator r17 = r15.iterator()
            r15 = 1
        L_0x018a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01cf
            java.lang.String r13 = X.C18180wK.A0k(r17)
            java.lang.Object r0 = r11.get(r13)
            if (r18 == 0) goto L_0x01a2
            java.lang.String r13 = "--"
            java.lang.String r6 = "sanitized-param-"
            java.lang.String r13 = X.AnonymousClass00U.A04(r15, r13, r6, r13)
        L_0x01a2:
            int r15 = r15 + 1
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "--sanitized--"
        L_0x01a8:
            r14.appendQueryParameter(r13, r0)
            goto L_0x018a
        L_0x01ac:
            java.lang.String r16 = "--"
            java.lang.StringBuilder r6 = X.C18190wL.A0s(r16)
            r6.append(r0)
            r0 = r16
            java.lang.String r0 = X.C18180wK.A0i(r0, r6)
            goto L_0x01a8
        L_0x01bc:
            java.lang.String r6 = "--"
            java.lang.StringBuilder r0 = X.C18190wL.A0s(r6)
            r0.append(r13)
            java.lang.String r0 = X.C18180wK.A0i(r6, r0)
            goto L_0x0182
        L_0x01ca:
            java.lang.String r0 = r5.getAuthority()
            goto L_0x017b
        L_0x01cf:
            android.net.Uri r0 = r14.build()
            java.lang.String r13 = r0.toString()
            goto L_0x0109
        L_0x01d9:
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r14 = r15.iterator()
        L_0x01e1:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.String r6 = X.C18180wK.A0k(r14)
            java.lang.String r0 = r5.getQueryParameter(r6)
            X.22n r0 = X.C61293Sq.A00(r0, r7)
            if (r0 == 0) goto L_0x01e1
            r11.put(r6, r0)
            goto L_0x01e1
        L_0x01f9:
            if (r18 == 0) goto L_0x028d
            java.lang.String r7 = r5.getScheme()
            java.lang.String r6 = "://"
            java.lang.String r0 = "--sanitized-authority--"
            java.lang.String r13 = X.AnonymousClass00U.A0V(r7, r6, r0)
        L_0x0207:
            r0 = r4
            if (r4 != 0) goto L_0x020b
            r0 = r2
        L_0x020b:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r12}
            java.util.Arrays.copyOf(r0, r1)
            r16 = r4
            if (r4 != 0) goto L_0x0218
            r16 = r2
        L_0x0218:
            java.lang.String r14 = r5.getScheme()
            if (r14 != 0) goto L_0x021f
            r14 = r2
        L_0x021f:
            java.lang.String r9 = "authority"
            java.lang.String r7 = "scheme"
            X.C04220Ms.A0B(r13, r1)
            java.lang.String r1 = "scopeType"
            X.0on r15 = r3.A00
            r6 = 817898872(0x30c02578, float:1.3980488E-9)
            java.lang.String r0 = "intent"
            X.0oo r6 = r15.ABJ(r0, r6)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x02a8
            java.lang.String r15 = "operation"
            java.lang.String r0 = "outgoing_intent"
            r6.A8U(r15, r0)
            r0 = r16
            r6.A8U(r9, r0)
            r6.A8U(r7, r14)
            java.lang.String r0 = "sanitized_uri"
            r6.A8U(r0, r13)
            r6.A8U(r1, r12)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x029d
            java.util.List r0 = X.AnonymousClass4WH.A06(r11)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r0, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x0262:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0290
            java.lang.Object r7 = r10.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "=--"
            r1.append(r0)
            java.lang.Object r0 = r7.A01
            r1.append(r0)
            java.lang.String r0 = "--"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            r9.add(r0)
            goto L_0x0262
        L_0x028d:
            r13 = r2
            goto L_0x0207
        L_0x0290:
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.Object[] r1 = r9.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "sensitive_extras"
            r6.A8W(r0, r1)
        L_0x029d:
            X.2AY r0 = new X.2AY
            r0.<init>()
            r6.Ciu(r0)
            r6.report()
        L_0x02a8:
            if (r4 != 0) goto L_0x02ab
            r4 = r2
        L_0x02ab:
            java.lang.String r0 = r5.getScheme()
            if (r0 == 0) goto L_0x02b2
            r2 = r0
        L_0x02b2:
            r0 = r19
            r3.A00(r4, r2, r0)
        L_0x02b7:
            return
        L_0x02b8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678540u.BkC(android.content.Context, android.content.Intent, android.content.Intent, X.0so, java.lang.Integer):void");
    }
}
