if (head == null){
            System.out.println("underflow");
        }
        else if (head.rlink == null){
            System.out.println("the deleted item is : " + head.info);
            head = null;
        }