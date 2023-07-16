package com.facebook.graphservice.serialization;

import X.AnonymousClass0qM;
import X.AnonymousClass7Ko;
import X.C86134wK;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.interfaces.TreeSerializer;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public class TreeSerializerJNI implements TreeSerializer {
    public final HybridData mHybridData;

    private native TreeJNI deserializeTreeFromByteBufferNative(ByteBuffer byteBuffer, Class cls, int i);

    private native TreeJNI deserializeTreeNative(String str, Class cls, int i, int i2, int i3);

    private native int serializeTreeNative(TreeJNI treeJNI, String str, boolean z, boolean z2);

    private native ByteBuffer serializeTreeToByteBufferNative(TreeJNI treeJNI, boolean z);

    static {
        AnonymousClass0qM.A02("graphservice-jni-serialization");
    }

    public TreeSerializerJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i) {
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            if (allocateDirect.isDirect()) {
                allocateDirect.put(byteBuffer.duplicate());
                allocateDirect.position(0);
                byteBuffer = allocateDirect;
            } else {
                throw C86134wK.A0s("Direct ByteBuffer is not supported on this platform");
            }
        }
        return deserializeTreeFromByteBufferNative(byteBuffer, cls, i);
    }

    public ByteBuffer serializeTreeToByteBuffer(Tree tree) {
        tree.getClass();
        AnonymousClass7Ko.A0B(tree.isValidGraphServicesJNIModelWithLogging());
        return serializeTreeToByteBufferNative((TreeJNI) tree, false);
    }
}
