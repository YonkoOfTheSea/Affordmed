class ToyTCPStreamReceiverAndReader{

    TreeMap<Integer,byte[]> map=new TreeMap<>();

    public void receive(int chunk, byte[] data){
        chunk--;
        map.put(chunk-1,data);
    }

    public String read(){
        final Integer maxKey = map.lastKey();
        final int maxLength = map.get(maxKey).length;
        byte[] bytes=new byte[maxKey+maxLength];
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            System.arraycopy(entry.getValue(),0,bytes,entry.getKey(),entry.getValue().length);
        }
        return new String(bytes);
    }

    public static void main(String[] args) {
        ToyTCPStreamReceiverAndReader toyTCPStreamReceiverAndReader=new ToyTCPStreamReceiverAndReader();
        toyTCPStreamReceiverAndReader.receive(6,new byte[]{'a',' ','P'});
        toyTCPStreamReceiverAndReader.receive(1,new byte[]{'I',' ','a',' ','m',' '});


    }

}