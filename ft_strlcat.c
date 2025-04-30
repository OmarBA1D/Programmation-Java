/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlcat.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 13:02:40 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 13:49:42 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include "libft.h"

size_t	ft_strlcat(char *dst, const char *src, size_t size)
{
	size_t	dst_len;
	size_t	src_len;
	size_t	i;

	src_len = ft_strlen(src);
	dst_len = ft_strlen(dst);
	if (size <= dst_len)
		return (size + src_len);
	i = 0;
	while (src[i] && (dst_len + i) < size - 1)
	{
		dst[dst_len + i] = src[i];
		i++;
	}
	dst[dst_len + i] = '\0';
	return (dst_len + src_len);
}
/*
int	main(void)
{
	char		dst[20] = "Hola";
	const char	*src = ", mundooo!";
	size_t		size = sizeof(dst);
	size_t		result;

	printf("Antes de ft_strlcat:\n");
	printf("dst: \"%s\"\n", dst);
	printf("src: \"%s\"\n", src);
	printf("size: %zu\n\n", size);
	result = ft_strlcat(dst, src, size);
	printf("Después de ft_strlcat:\n");
	printf("dst: \"%s\"\n", dst);
	printf("Resultado (longitud esperada): %zu\n", result);
	printf("Longitud real de dst: %zu\n", strlen(dst));
	return (0);
}*/
