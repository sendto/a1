create or replace FUNCTION ostsci2.translit(p_str IN VARCHAR2) RETURN VARCHAR2 IS
    ret VARCHAR2(32000) := p_str;
    l_upper BOOLEAN := FALSE;
  BEGIN
    IF upper(p_str)=p_str THEN 
      l_upper := TRUE;
    END IF; 
    ret := translate(ret, '�������������������������', 'ABVGDEZIYKLMNOPRSTUFHY''''E');
    ret := REPLACE(ret, '�', 'Zh');
    ret := REPLACE(ret, '�', 'Yo');
    ret := REPLACE(ret, '�', 'Ts');
    ret := REPLACE(ret, '�', 'Ch');
    ret := REPLACE(ret, '�', 'Sh');
    ret := REPLACE(ret, '�', 'Sch');
    ret := REPLACE(ret, '�', 'Yu');
    ret := REPLACE(ret, '�', 'Ya');
    IF l_upper THEN
       ret := upper(ret);
    END IF;
    -- lowercase 
    RET := TRANSLATE(RET, '�������������������������', 'abvgdeziyklmnoprstufhy''''e');
    RET := REPLACE(RET, '�', 'zh');
    RET := REPLACE(RET, '�', 'yo');
    RET := REPLACE(RET, '�', 'ts');
    RET := REPLACE(RET, '�', 'ch');
    RET := REPLACE(RET, '�', 'sh');
    RET := REPLACE(RET, '�', 'sch');
    RET := REPLACE(RET, '�', 'yu');
    RET := REPLACE(RET, '�', 'ya');
    RETURN ret;
  END;
/