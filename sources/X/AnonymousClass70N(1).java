package X;

import android.util.Base64;
import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.instagram.barcelona.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.70N  reason: invalid class name */
public final class AnonymousClass70N {
    public static Object A00(C63893iY r13, C110486ll r14, C109326jp r15) {
        AnonymousClass78w r0;
        String message;
        String str;
        AnonymousClass3HX r02;
        boolean z;
        C122147Ku r8;
        C105936eE r1;
        String str2;
        AnonymousClass78w r03;
        if (r15 != null) {
            C131627sW r2 = r14.A03;
            C104686cC r5 = r14.A01;
            A01(r15);
            C109346jr r6 = r15.A00;
            if (r6 != null) {
                BloksScript bloksScript = r15.A01;
                if (bloksScript != null) {
                    r0 = bloksScript.A00;
                    if (r0 == null) {
                        throw C18180wK.A0a("getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method");
                    }
                } else {
                    r0 = r6.A00.A03;
                }
                r2.BmM(r13, r15, r0.A00);
                try {
                    List<Object> unmodifiableList = Collections.unmodifiableList(r13.A00);
                    ThreadLocal threadLocal = AnonymousClass6YO.A00;
                    if (threadLocal.get() == null) {
                        z = true;
                        r8 = new C122147Ku();
                        threadLocal.set(r8);
                    } else {
                        z = false;
                        r8 = (C122147Ku) threadLocal.get();
                    }
                    try {
                        C105936eE r10 = new C105936eE(r14);
                        int i = r8.A01;
                        C122147Ku.A0G(r8, unmodifiableList.size() + 1 + 5);
                        r8.A0P((Object) null);
                        for (Object A0P : unmodifiableList) {
                            r8.A0P(A0P);
                        }
                        C122147Ku.A0H(r8, new C105916eC(new C109326jp((BloksScript) null, r6, r6.A01)), (Object) null, unmodifiableList.size(), r8.A02);
                        r1 = r8.A03;
                        r8.A03 = r10;
                        C122147Ku.A0E(r8);
                        r8.A03 = r1;
                        Object A07 = C122147Ku.A07(r8);
                        C122147Ku.A0F(r8);
                        int i2 = r8.A01;
                        if (i2 != i) {
                            C122147Ku.A0J(String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", C18210wN.A1Y(Integer.valueOf(i2), i)));
                            throw null;
                        }
                        if (z) {
                            threadLocal.remove();
                        }
                        if (bloksScript != null) {
                            r03 = bloksScript.A00;
                            if (r03 == null) {
                                throw C18180wK.A0a("getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method");
                            }
                        } else {
                            C109346jr r04 = r15.A00;
                            if (r04 != null) {
                                r03 = r04.A00.A03;
                            } else {
                                str2 = null;
                                r2.BkD(r13, r15, A07, str2);
                                return A07;
                            }
                        }
                        str2 = r03.A00;
                        r2.BkD(r13, r15, A07, str2);
                        return A07;
                    } catch (C1373988k e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        try {
                            throw new C1373988k((Throwable) e2);
                        } catch (C1373988k e3) {
                            if (z) {
                                try {
                                    throw new AnonymousClass6C9(e3);
                                } catch (Throwable th) {
                                    if (z) {
                                        threadLocal.remove();
                                    }
                                    throw th;
                                }
                            } else {
                                throw e3;
                            }
                        }
                    } catch (Throwable th2) {
                        r8.A03 = r1;
                        throw th2;
                    }
                } catch (AnonymousClass6C9 e4) {
                    if (e4.getMessage() == null) {
                        message = "";
                    } else {
                        message = e4.getMessage();
                    }
                    r2.CIc(r15, message);
                    if (r5 != null) {
                        C04220Ms.A0B(message, 0);
                        C14090on r22 = r5.A00;
                        if (r22 != null) {
                            if (!(r14 instanceof AnonymousClass601) || (r02 = ((AnonymousClass601) r14).A00) == null || (str = (String) r02.A01.get(R.id.bk_context_key_logging_id)) == null) {
                                str = "unknown_callsite";
                            }
                            C14100oo ABJ = r22.ABJ(str, 36705544);
                            ABJ.A8U("bloks_logging_id", str);
                            ABJ.A8U("bloks_raw_server_stack_trace", message);
                            ABJ.report();
                        }
                    }
                    throw e4;
                }
            } else {
                throw C18180wK.A0a("The Lispy expression has not been parsed");
            }
        } else {
            throw C18250wR.A0V("Interpreter.evaluate expects OpaqueExpression");
        }
    }

    public static void A01(C109326jp r15) {
        ByteBuffer doCompile;
        if (r15.A00 == null) {
            BloksScript bloksScript = r15.A01;
            if (bloksScript != null) {
                AnonymousClass78w r9 = bloksScript.A00;
                if (r9 == null) {
                    String str = bloksScript.A01;
                    if (str.startsWith("sraxr")) {
                        doCompile = ByteBuffer.wrap(Base64.decode(str, 0));
                    } else {
                        if (str.startsWith("lispx")) {
                            str = str.substring(15);
                        }
                        try {
                            doCompile = MinsCompilerImpl$Helper.doCompile(str.getBytes("UTF-8"));
                        } catch (UnsupportedEncodingException e) {
                            throw C86114wI.A0k(e);
                        }
                    }
                    doCompile.order(ByteOrder.nativeOrder());
                    ByteBuffer slice = doCompile.slice();
                    slice.order(doCompile.order());
                    int capacity = doCompile.capacity();
                    int i = slice.getInt();
                    short s = slice.getShort() & 65535;
                    short s2 = 65535 & slice.getShort();
                    if (i == -1397639502 && s == 1 && s2 == 0) {
                        int i2 = slice.getInt();
                        int i3 = slice.getInt();
                        int position = doCompile.position();
                        if (i2 > capacity) {
                            StringBuilder A0s = C18190wL.A0s("buffer is smaller than encoded size ");
                            A0s.append(i2);
                            A0s.append(" ");
                            A0s.append(capacity);
                            A0s.append(" byteBuffer.order:");
                            A0s.append(doCompile.order());
                            A0s.append(" native order:");
                            throw new C1373988k(C18200wM.A0m(ByteOrder.nativeOrder(), A0s));
                        } else if (i2 >= position) {
                            int i4 = position + (i3 << 4);
                            if (i4 <= i2) {
                                C109336jq[] r14 = new C109336jq[i3];
                                int i5 = 0;
                                while (i5 < i3) {
                                    C109336jq r2 = new C109336jq();
                                    r2.A00 = slice.getInt();
                                    r2.A02 = slice.getInt();
                                    r2.A01 = slice.getInt();
                                    slice.getInt();
                                    int i6 = r2.A02;
                                    if (i6 % 4 == 0) {
                                        int i7 = r2.A01;
                                        if (i4 > i6 || i6 + i7 > i2) {
                                            throw new C1373988k(String.format("section index %d kind %d invalid offset/size", C18210wN.A1Y(Integer.valueOf(i5), r2.A00)));
                                        }
                                        r14[i5] = r2;
                                        i5++;
                                    } else {
                                        throw new C1373988k(String.format("section index %d kind %d invalid alignment", C18210wN.A1Y(Integer.valueOf(i5), r2.A00)));
                                    }
                                }
                                if (i3 >= 4) {
                                    int i8 = 0;
                                    while (r14[i8].A00 == i8) {
                                        i8++;
                                        if (i8 >= 4) {
                                            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(r14[0].A01 >> 4);
                                            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(r14[1].A01 >> 4);
                                            String str2 = "";
                                            for (int i9 = 4; i9 < i3; i9++) {
                                                C109336jq r7 = r14[i9];
                                                if (r7.A00 == 4) {
                                                    ByteBuffer duplicate = slice.duplicate();
                                                    duplicate.position(r7.A02);
                                                    duplicate.limit(r7.A02 + r7.A01);
                                                    byte[] bArr = new byte[duplicate.remaining()];
                                                    duplicate.get(bArr);
                                                    str2 = new String(bArr, AnonymousClass78w.A05);
                                                }
                                            }
                                            r9 = new AnonymousClass78w(str2, slice, atomicReferenceArray, atomicReferenceArray2, r14);
                                            bloksScript.A00 = r9;
                                        }
                                    }
                                    throw new C1373988k(AnonymousClass00U.A0J("missing required section ", i8));
                                }
                                throw new C1373988k("less than required number of sections");
                            }
                            throw new C1373988k("encoded size not enough for section headers");
                        } else {
                            throw new C1373988k("encoded size is too small");
                        }
                    } else {
                        throw new C1373988k("invalid magic or version");
                    }
                }
                r15.A00 = new C109346jr(r9.A00(0), r15.A02, (Object[]) null);
                return;
            }
            throw C18180wK.A0a("The Lispy expression cannot be parsed");
        }
    }
}
