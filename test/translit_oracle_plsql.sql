create or replace FUNCTION ostsci2.translit(p_str IN VARCHAR2) RETURN VARCHAR2 IS
    ret VARCHAR2(32000) := p_str;
    l_upper BOOLEAN := FALSE;
  BEGIN
    IF upper(p_str)=p_str THEN 
      l_upper := TRUE;
    END IF; 
    ret := translate(ret, 'АБВГДЕЗИЙКЛМНОПРСТУФХЫЪЬЭ', 'ABVGDEZIYKLMNOPRSTUFHY''''E');
    ret := REPLACE(ret, 'Ж', 'Zh');
    ret := REPLACE(ret, 'Ё', 'Yo');
    ret := REPLACE(ret, 'Ц', 'Ts');
    ret := REPLACE(ret, 'Ч', 'Ch');
    ret := REPLACE(ret, 'Ш', 'Sh');
    ret := REPLACE(ret, 'Щ', 'Sch');
    ret := REPLACE(ret, 'Ю', 'Yu');
    ret := REPLACE(ret, 'Я', 'Ya');
    IF l_upper THEN
       ret := upper(ret);
    END IF;
    -- lowercase 
    RET := TRANSLATE(RET, 'абвгдезийклмнопрстуфхыъьэ', 'abvgdeziyklmnoprstufhy''''e');
    RET := REPLACE(RET, 'ж', 'zh');
    RET := REPLACE(RET, 'ё', 'yo');
    RET := REPLACE(RET, 'ц', 'ts');
    RET := REPLACE(RET, 'ч', 'ch');
    RET := REPLACE(RET, 'ш', 'sh');
    RET := REPLACE(RET, 'щ', 'sch');
    RET := REPLACE(RET, 'ю', 'yu');
    RET := REPLACE(RET, 'я', 'ya');
    RETURN ret;
  END;
/