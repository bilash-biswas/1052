var
a: int64;
begin
   read(a);

   case(a)of
      1:writeln('January');
      2:writeln('February');
      3:writeln('March');
      4:writeln('April');
      5:writeln('May');
      6:writeln('June');
      7:writeln('July');
      8:writeln('August');
      9:writeln('September');
      10:writeln('October');
      11:writeln('November');
      12:writeln('December');
   else
      writeln('Invalid input');
   end
end.
