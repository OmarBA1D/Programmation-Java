/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memchr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 17:27:53 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 17:41:38 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

void	*ft_memchr(const void *s, int c, size_t n)
{
	const unsigned char	*ptr;
	unsigned char		ch;

	ptr = s;
	ch = (unsigned char)c;
	while (n-- > 0)
	{
		if (*ptr == ch)
			return ((void *)ptr);
		ptr++;
	}
	return (NULL);
}
/*
int	main(void)
{
	char	texto[] = "Hala madrid";
	char	*resultado;

	resultado = ft_memchr(texto, 'd', sizeof(texto));
	if (resultado != NULL)
		printf("Encontrado: %s\n", resultado);
	else
		printf("No encontrado\n");
	return (0);
}*/
