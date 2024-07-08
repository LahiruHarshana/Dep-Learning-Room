/**
 * @author : L.H.J
 * @File: MySingleElementAnnotation
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public @interface MySingleElementAnnotation {
    int value();
    //Attribute name should be value , otherwise we can't call this a single element annotation
    //even through it has a single element
}
