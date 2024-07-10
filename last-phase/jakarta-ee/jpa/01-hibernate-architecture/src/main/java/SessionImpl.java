/**
 * @author : L.H.J
 * @File: SessionImpl
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class SessionImpl implements Session{
    @Override
    public void persist() {
        System.out.println("Persist");
    }

    @Override
    public void remove() {
        System.out.println("remove");
    }

    @Override
    public void refresh() {
        System.out.println("refresh");
    }

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void saveAndUpdate() {
        System.out.println("saveAndUpdate");
    }

    @Override
    public void delete() {
        System.out.println("Demo");
    }
}
